package Steps.SeleniumStep;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InfiniteScrollSteps {
    WebDriver driver;


    public void setUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void openLink() {
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
    }

    public void scrollInfinite() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        double Beforescroll = 0;
        for (int i = 0; i < 3; i++) {
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,500)");
            double Y = (double) js.executeScript("return window.pageYOffset;");
            Assert.assertTrue(Y > Beforescroll);
            Beforescroll = Y;
        }
    }
}
