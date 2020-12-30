package Tools;

import com.cucumber.listener.Reporter;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static Libs.WebLibrary.*;

public class Hooks {

    public static WebDriver driver;

    public RemoteWebDriver rDriver(String host, Capabilities getCapabilities) throws MalformedURLException {

        return new RemoteWebDriver(new URL(host), getCapabilities);
    }

    @Before("@Firefox")
    public void runWithFireFox() {
        selectDriver("firefox");
    }

    @After("@Firefox")
    public void tearDownFireFox(Scenario scenario) {
        defaultCloseAction(scenario);
    }

    @Before("@Chrome")
    public void runWithChrome() {
        selectDriver("chrome");

    }

    @After("@Chrome")
    public void tearDownChrome(Scenario scenario) throws Exception {
        defaultCloseAction(scenario);
    }


    private void selectDriver(String selectedDriver) {

        String os = System.getProperty("os.name").toLowerCase();
        String chrome_id = "webdriver.chrome.driver";
        String firefox_id = "webdriver.gecko.driver";

        String chrome_path_win = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
        String chrome_path_linux = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
        String firefox_path_win = System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe";
        String firefox_path_linux = System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        if (os.contains("win")) {

            if (selectedDriver.equals("chrome")) {
                System.out.println("Chrome Windows");
                System.setProperty(chrome_id, chrome_path_win);
                driver = new ChromeDriver(options);
            }
            if (selectedDriver.equals("firefox")) {
                System.out.println("Firefox Windows");
                System.setProperty(firefox_id, firefox_path_win);
                driver = new FirefoxDriver();
            }

        } else if (os.contains("nux") || os.contains("nix") || os.contains("aix")) {
            if (selectedDriver.equals("chrome")) {
                System.out.println("Chrome Linux");
                System.setProperty(chrome_id, chrome_path_linux);
                driver = new ChromeDriver(options);
            }
            if (selectedDriver.equals("firefox")) {
                System.out.println("Firefox Linux");
                System.setProperty(firefox_id, firefox_path_linux);
                driver = new FirefoxDriver();
            }

        } else if (os.contains("mac")) {
            System.out.println("This is Mac");
            // Mac Passive
        } else {
            System.out.println("Your OS is not support!");
        }

    }

    private void defaultCloseAction(Scenario scenario) {
        TakeScreenShot(scenario);
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Scenario parametresi ile ekran görüntüsü alarak static path'e kaydeder. Raporlama için kullanılıyor.
     *
     * @param scenario
     * @author Koray Saldere
     */

    // TODO Rapor Dosyalarını arşivleyecek şekilde güncellenecek.
    private void TakeScreenShot(Scenario scenario) {

        String ssFilePath = System.getProperty("user.dir") + "/src/test/resources/cucumber-reports/screenshots/" + GetDateTime() + ".png";
        String ssReportPath = "./screenshots/" + GetDateTime() + ".png";

        if (scenario.isFailed()) {

            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File dest = new File(ssFilePath);
                FileUtils.copyFile(scr, dest);
                Reporter.addScreenCaptureFromPath(ssReportPath);
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

