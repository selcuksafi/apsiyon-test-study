package Libs;

import Tools.Hooks;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.awt.*;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class WebStep {

    public static String tempVariable;

    @When("^I? move mouse reset position$")
    public static void ResetMousePosition() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(0, 0);
    }

    @When("^I? move mouse X (.*) and Y (.*) position$")
    public static void MoveMousePosition(int x, int y) throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(x, y);
    }

    @Given("^I? go to ([^\"]*) page$")
    public static void GoToURL(String url) throws MalformedURLException {
        WebLibrary.gotoURL(url);
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
    }

    @When("^I? click ([^\"]*) element$")
    public static void Click(String element) {
        try {
            WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
            WebLibrary.findElement(element).click();
        }catch (Exception e){

            Assert.fail("Element not found. Element is null");
        }
    }

    @When("^I? click ([^\"]*) element if exist$")
    public static void ClickElementExist(String element) {

        try {
            WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
            WebLibrary.findElement(element).click();
        } catch (WebDriverException ignore) {
        }
    }

    @When("^I? get ([^\"]*) element text and keep temp variable$")
    public static void getElementText(String element) {
       tempVariable = WebLibrary.findElement(element).getText();
    }

    @When("^I? compare ([^\"]*) text with temp variable text$")
    public static void getElementTextCompareTemp(String element) {
        String expectedString =  WebLibrary.findElement(element).getText();
        Assert.assertEquals(tempVariable,expectedString);
    }

    @When("^I? press ENTER key$")
    public static void pressEnterKey() {
        Actions action = new Actions(WebLibrary.driver);
        action.sendKeys(Keys.ENTER);
    }

    @When("^I? click ([^\"]*) text$")
    public static void ClickText(String element) throws Exception {
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
        WebLibrary.findElementBy(By.linkText(element)).click();
    }

    @When("^I? clear ([^\"]*) element area$")
    public static void Clear(String element) {
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
        WebLibrary.findElement(element).clear();
    }

    @When("^I? write text ([^\"]*) text area ([^\"]*)$")
    public static void SendKeys(String text, String element) {
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
        WebLibrary.findElement(element).sendKeys(text);
    }

    @When("^I? mouse over ([^\"]*) element$")
    public static void MouseOver(String element) {
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
        WebLibrary.driver = Hooks.driver;
        Actions actions = new Actions(WebLibrary.driver);
        actions.moveToElement(WebLibrary.findElement(element)).perform();
    }

    @When("^I? url must be ([^\"]*)$")
    public static void CheckUrl(String expected) {
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
        String actual;
        actual = WebLibrary.currentUrl();
        Assert.assertEquals(actual, expected);
    }

    @When("^I? base url must be ([^\"]*)$")
    public static void CheckBaseUrl(String expected) {
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
        String actual;
        String[] parts = WebLibrary.currentUrl().split("/");
        actual = parts[2];
        Assert.assertEquals(actual, expected);
    }


    @When("^I? wait page load$")
    public static void WaitPageLoad() {

        WebLibrary.driver = Hooks.driver;
        WebDriverWait waitDriver = new WebDriverWait(WebLibrary.driver, WebLibrary.pageLoadTimeout);
        waitDriver.until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
    }

    @When("^I? wait (.*) second$")
    public static void WaitTime(int second) throws Exception {
        TimeUnit.SECONDS.sleep(second);
    }

    @When("^I? wait ([^\"]*) element to be clickable$")
    public static void WaitElementToBeClickable(String element) throws Exception {

        WebLibrary.driver = Hooks.driver;
        WebDriverWait wait = new WebDriverWait(WebLibrary.driver, WebLibrary.pageLoadTimeout);
        wait.until(ExpectedConditions.elementToBeClickable(WebLibrary.findElement(element)));
    }

    @When("^I? see ([^\"]*) text$")
    public static void seeText(String text) {
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
        String returnedText = null;
        String rawXpath = String.format("//*[text()='%s']", text);
        try {
            returnedText = WebLibrary.findElementBy(By.xpath(rawXpath)).getText();
        } catch (WebDriverException e) {
            Assert.fail("Text not found. Text is : " + returnedText);
            //e.printStackTrace();
        }
    }

    @When("^I? see ([^\"]*) element$")
    public static void seeElement(String element) {
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
        WebElement returnedText = null;

        try {
            returnedText = WebLibrary.findElement(element);
        } catch (WebDriverException e) {
            Assert.fail("Element not found. Element is : " + returnedText);
            //e.printStackTrace();
        }
    }

    @When("^I? wait ([^\"]*) element ([^\"]*)$")
    public static void waitElementWithCondition(String element, String condition) throws Exception {
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
        //WebLibrary.driver = Hooks.driver;
        WebDriverWait wait = new WebDriverWait(WebLibrary.driver, WebLibrary.pageLoadTimeout);
        Object returnedElement = null;

        try {
            if (condition.equalsIgnoreCase("visible")) {
                returnedElement = wait.until(ExpectedConditions.visibilityOf(WebLibrary.findElement(element)));
                WaitTime(1);

            }
            if (condition.equalsIgnoreCase("invisible")) {
                returnedElement = wait.until(ExpectedConditions.invisibilityOf(WebLibrary.findElement(element)));
                WaitTime(1);
            }
            if (condition.equalsIgnoreCase("clickable")) {
                returnedElement = wait.until(ExpectedConditions.elementToBeClickable(WebLibrary.findElement(element)));
                WaitTime(1);
            }
            if (condition.equalsIgnoreCase("selectable")) {
                returnedElement = wait.until(ExpectedConditions.elementToBeSelected(WebLibrary.findElement(element)));
                WaitTime(1);
            }

        } catch (WebDriverException e) {
            Assert.fail("Element not found. Element is :" + returnedElement);
        }

    }

    @When("^I? get element text and compare with text$")
    public static void getElementTextAndCompare(DataTable table) {
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
        java.util.List<String> list = table.asList(String.class);
        String actual = WebLibrary.findElement(list.get(0)).getText();
        String expected = list.get(1);

        Assert.assertEquals(actual, expected);
    }

    @When("^I? get element text contains in text$")
    public static void getElementTextContains(DataTable table) {
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
        java.util.List<String> list = table.asList(String.class);
        String getElementText = WebLibrary.findElement(list.get(0)).getText();

        if (getElementText.contains(list.get(1))) {

            Assert.assertTrue(true);
        } else {

            Assert.fail(list.get(1) + " bulunamadı.");
        }
    }

    @When("^I? check all ([^\"]*) category under ([^\"]*) images is loaded$")
    public static void checkCategoryUnderImages(String category, String images) throws Exception {
        try {
            WaitTime(3);
            WebLibrary.findElement(category).click();
            WaitPageLoad();
            WaitTime(1);
            checkImageValidity(images);
        } catch (WebDriverException ignore) {
        }
    }

    @When("^I? check ([^\"]*) all images is loaded$")
    public static void checkImageValidity(String element) throws Exception {
        try {
            WaitTime(3);

            List<WebElement> elements = WebLibrary.findElements(element); //WebLibrary.driver.findElements(By.xpath(getElement));

            for (WebElement webElement : elements) {

                if (!webElement.isDisplayed()) {
                    System.out.println("not load : " + webElement);
                }
            }

        } catch (WebDriverException ignore) {
        }
    }

    // Custom Step
    // TODO Düzenlenecek...
    @When("^I login with$")
    public void login(DataTable dataTable) throws Throwable {

        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);

        // User Name
        WaitPageLoad(); // TODO : WaitPageLoad(), AfterStep altına taşınacak.
        String inputUserName = list.get(0).keySet().toArray()[0].toString();
        String userName = list.get(0).values().toArray()[0].toString();
        WebLibrary.findElement(inputUserName).sendKeys(userName);

        // Password
        String inputPassword = list.get(0).keySet().toArray()[1].toString();
        String password = list.get(0).values().toArray()[1].toString();
        WebLibrary.findElement(inputPassword).sendKeys(password);

        // Login Button
        String loginButton = list.get(1).values().toArray()[0].toString();
        Actions action = new Actions(WebLibrary.driver);
        action.sendKeys(Keys.ENTER);
        WebLibrary.findElement(loginButton).click();
        //waitElementWithCondition(loginButton, "invisible");
        WaitTime(10);
        //WaitPageLoad();

    }
}
