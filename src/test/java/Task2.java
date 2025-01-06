import Drivers.Driver;
import Steps.InfiniteScrollSteps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2 extends Driver {

    @BeforeMethod
    public void setUp() {
        driver = SetUpDriver();
    }

    @Test
    public void Openchrome() throws InterruptedException {
        InfiniteScrollSteps infiniteScrollSteps = new InfiniteScrollSteps();
        infiniteScrollSteps.setUp(driver);
        infiniteScrollSteps.openLink();
        infiniteScrollSteps.scrollInfinite();


    }

    @AfterMethod
    public void driverClose() {
        closeDriver();
    }

}



