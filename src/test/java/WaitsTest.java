import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitsTest {
    @Test
    public static void OpenChrome(){
        System.setProperty("web driver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/progress-bar");
        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/button"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.className("progress-bar")),"100%"));
        System.out.println("100%");
        driver.close();



    }


}

