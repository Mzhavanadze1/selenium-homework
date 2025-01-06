import Drivers.Driver;
import Steps.ScroolToFooterSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4 extends Driver {
    @BeforeMethod
    public void setUp() {
        driver = SetUpDriver();

    }
    @Test
    public  void Task4() throws InterruptedException {
        ScroolToFooterSteps scroolToFooterSteps = new ScroolToFooterSteps();
        scroolToFooterSteps.setUp(driver);
        scroolToFooterSteps.openLink();
        scroolToFooterSteps.scrollToFooter();
        Assert.assertTrue(scroolToFooterSteps.footer.isDisplayed());

    }
    @AfterMethod
    public void driverClose() {
        closeDriver();
    }
}
