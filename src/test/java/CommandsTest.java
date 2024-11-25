import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommandsTest {
@Test
    public static void OpenChrome(){
    System.setProperty("web driver.chrome.driver","src/main/resources/chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("http://the-internet.herokuapp.com/dynamic_controls");
    WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form[2]/button"));
    button.click();
    String message = driver.findElement(By.id("message")).getText();


    if (message.equals("It's enabled!")){
        System.out.println(message);
    }
   String buttonmess = button.getText();
    if (buttonmess.equals("Disable")){
        System.out.println(buttonmess);
    }
    WebElement veli = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form[2]/input"));
    veli.sendKeys("Bootcamp");
    veli.clear();

    driver.get("https://the-internet.herokuapp.com/drag_and_drop");
    WebElement otxkutxedi1 = driver.findElement(By.id("column-a"));
    int Y1 =otxkutxedi1.getSize().getHeight();
    WebElement otxkutxedi2 = driver.findElement(By.id("column-b"));
    int Y2 = otxkutxedi2.getSize().getHeight();

    if (Y1==Y2){
        System.out.println("Y = " + Y1);
    }
    driver.close();













    }
}
