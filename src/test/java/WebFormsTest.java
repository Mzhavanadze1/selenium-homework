import Drivers.Driver;
import Steps.WebdriverPageSteps;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebFormsTest extends Driver {

    @BeforeMethod
    public void setUp() {
        driver = SetUpDriver();

    }

    @Test
    public void OpenChrome() {
        WebdriverPageSteps webdriverPageSteps = new WebdriverPageSteps();
        webdriverPageSteps.setUp(driver);
        webdriverPageSteps.openLink();
        Assert.assertTrue(webdriverPageSteps.checkDropdown());
        webdriverPageSteps.clickCheckBoxes();
        Assert.assertFalse(webdriverPageSteps.clickSelect());


    }

    @AfterMethod
    public void driverClose() {
        closeDriver();
    }

}

