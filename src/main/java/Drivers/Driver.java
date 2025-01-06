package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
   public WebDriver driver;
    public WebDriver SetUpDriver (){
        System.setProperty("web driver.chrome.driver","src/main/resources/chromedriver");
        this.driver=new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this.driver;
    }
    public void closeDriver(){
        this.driver.close();
    }
}
