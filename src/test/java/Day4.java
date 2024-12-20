import Drivers.Driver;
import Steps.DemocaTipsSteps;
import Steps.GoogleSteps;
import Steps.HerokuappTableSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class Day4 extends Driver {



    @BeforeMethod
    public void setUp() {
        driver = SetUpDriver();

    }

    @Test
    public void StaticTable() {
        HerokuappTableSteps herokuappTableSteps = new HerokuappTableSteps();
        herokuappTableSteps.setUp(driver);
        herokuappTableSteps.openLink();
        Assert.assertTrue(herokuappTableSteps.checkTableRows());

    }


    @Test
    public void HoverMeToSee() {
        DemocaTipsSteps democaTipsSteps = new DemocaTipsSteps();
        democaTipsSteps.setUp(driver);
        democaTipsSteps.openLink();
        democaTipsSteps.scrollTobutton();
        Assert.assertTrue(democaTipsSteps.toolTipButton.isDisplayed());

    }


    @Test
    public void Robot() throws InterruptedException, AWTException {
        GoogleSteps googleSteps = new GoogleSteps();
        googleSteps.setUp(driver);
        googleSteps.openLink();
        googleSteps.robotActions();

    }

    @AfterMethod
    public void driverClose() {
        closeDriver();
    }

}

