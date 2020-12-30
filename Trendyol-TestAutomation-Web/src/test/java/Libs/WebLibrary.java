package Libs;

import Tools.Hooks;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static Tools.ReadJson.*;

public class WebLibrary {

    public static WebDriver driver;
    static int elementTimeout = Integer.parseInt(readConfigJson("elementTimeout"));
    static int pageLoadTimeout = Integer.parseInt(readConfigJson("pageLoadTimeout"));

    public static WebElement findelementBy(By element) {

        driver = Hooks.driver;
        WebDriverWait wait = new WebDriverWait(driver, elementTimeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

        return driver.findElement(element);
    }

    public static List<WebElement> findElementsBy(By element) {

        driver = Hooks.driver;
        WebDriverWait wait = new WebDriverWait(driver,elementTimeout);
        List<WebElement> getElementItem = new ArrayList<>();
        List<WebElement> elements;

        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        elements = driver.findElements(element);

        for (WebElement getElement : elements) {

            getElementItem.add(getElement.findElement(element));
        }
        return getElementItem;
    }

    public static WebElement findElementBy(By element) {

        driver = Hooks.driver;

        WebDriverWait wait = new WebDriverWait(driver,elementTimeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return driver.findElement(element);
    }

    public static WebElement findElement(String element) {

        String getElement;
        WebElement returnElement = null;

        driver = Hooks.driver;
        WebDriverWait wait = new WebDriverWait(driver, elementTimeout);

        if (readJsonString(element)!= null){

            getElement = readJsonString(element);
        } else {

            getElement = element;
        }

        try {

            if (getElement.startsWith("//") || getElement.startsWith("(//")) {

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(getElement)));
                returnElement = driver.findElement(By.xpath(getElement));

            } else if (getElement.startsWith("#") || getElement.startsWith(".")) {

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(getElement)));
                returnElement = driver.findElement(By.cssSelector(getElement));
            }
        } catch (Exception ignore) {

            //Assert.fail("Element not found." + "\n" + "Element is : " + returnElement);
        }
        return returnElement;
    }


    public static List<WebElement> findElements(String element) {

        driver = Hooks.driver;
        String gElement;
        WebDriverWait wait = new WebDriverWait(driver, elementTimeout);
        List<WebElement> getElementItem = new ArrayList<>();
        List<WebElement> elements;


        if (readJsonString(element)!= null){

            gElement = readJsonString(element);
        } else {

            gElement = element;
        }

        try {
            if (gElement.startsWith("//") || gElement.startsWith("(//")) {

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(gElement)));
                elements = driver.findElements(By.xpath(gElement));

                for (WebElement getElement : elements) {

                    getElementItem.add(getElement.findElement(By.xpath(element)));
                }
            } else if (gElement.startsWith("#") || gElement.startsWith(".")) {

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(gElement)));
                elements = driver.findElements(By.cssSelector(gElement));

                for (WebElement getElement : elements) {

                    getElementItem.add(getElement.findElement(By.cssSelector(gElement)));
                }
            }
        } catch (Exception ignore) {

            //Assert.fail("Element not found." + "\n" + "Element is : " + element);
        }
        return getElementItem;
    }

    public static void gotoURL(String URL)throws MalformedURLException {

        driver = Hooks.driver;
        driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.MINUTES);
        driver.get(URL);
    }

    public static String currentUrl() {

        return driver.getCurrentUrl();

    }

    public static String GetDateTime() {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+3"));
        return dateFormat.format(date);
    }
}
