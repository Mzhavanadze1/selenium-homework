import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task2 {
    @Test
    public static void Openchrome() throws InterruptedException {
        System.setProperty("web driver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        double Beforescroll = 0;
        for (int i=0; i<3;i++){
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,500)");
            double Y = (double) js.executeScript("return window.pageYOffset;");
            Assert.assertTrue(Y > Beforescroll);
            Beforescroll= Y;
        }

        driver.close();

    }
}
