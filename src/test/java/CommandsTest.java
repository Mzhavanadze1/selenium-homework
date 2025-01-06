import Drivers.Driver;
import Steps.HerokuDragAndDropSteps;
import Steps.HerokuappSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CommandsTest extends Driver {

    @BeforeMethod
    public void setUp() {
        driver = SetUpDriver();

    }


    @Test
    public void OpenChrome() {
        HerokuappSteps herokuappSteps = new HerokuappSteps();
        herokuappSteps.setUp(driver);
        herokuappSteps.clickButton();
        Assert.assertEquals(herokuappSteps.getText(), "It's enabled!");
        Assert.assertEquals(herokuappSteps.getButtonText(), "Disable");
        herokuappSteps.sendKey("Bootcamp");
        herokuappSteps.clear();


        HerokuDragAndDropSteps herokuDragAndDropSteps = new HerokuDragAndDropSteps();
        herokuDragAndDropSteps.setUp(driver);
        Assert.assertTrue(herokuDragAndDropSteps.compareColumnHeight());


    }

    @AfterMethod
    public void driverClose() {
        closeDriver();
    }

}
