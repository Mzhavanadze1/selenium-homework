package SeleniumTests;

import Drivers.Driver;
import Steps.SeleniumStep.ProgressBarSteps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitsTest extends Driver {
    @BeforeMethod
    public void setUp() {
        driver = SetUpDriver();

    }

    @Test
    public void OpenChrome() throws InterruptedException {
        ProgressBarSteps progressBarSteps = new ProgressBarSteps();
        progressBarSteps.setUp(driver);
        progressBarSteps.openLink();
        progressBarSteps.waitProgressBar("100%");


    }

    @AfterMethod
    public void driverClose() {
        closeDriver();
    }


}

