package SeleniumTests;

import Drivers.Driver;
import Steps.SeleniumStep.TextBoxSteps;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task3 extends Driver {

    @BeforeMethod
    public void setUp() {
        driver = SetUpDriver();
    }

    @Test
    public void Task3() throws InterruptedException {
        TextBoxSteps textBoxSteps = new TextBoxSteps();
        textBoxSteps.setUp(driver);
        textBoxSteps.openLink();
        textBoxSteps.scrollToBtn();
        Assert.assertTrue(textBoxSteps.submitBtn.isDisplayed());
        Assert.assertTrue(textBoxSteps.submitBtn.isEnabled());

    }

    @AfterMethod
    public void driverClose() {
        closeDriver();
    }
}