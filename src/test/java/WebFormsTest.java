import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebFormsTest {
    @Test
    public static void OpenChrome(){
        System.setProperty("web driver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement button =driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
        button.click();

        WebElement option = button.findElement(By.xpath("//option[@value='python']"));
        option.click();
        button.click();

        if (option.isSelected()){
            System.out.println("Python");
        }


        List<WebElement> checkbox= driver.findElements(By.xpath("//div[@id='checkboxes']//label//input"));
        for (WebElement element:checkbox){
            if (!element.isSelected()) {
                element.click();
            }
        }
        WebElement RadioButton= driver.findElement(By.xpath("//form[@id='radio-buttons']//input[@value='yellow']"));
        RadioButton.click();

        WebElement select= driver.findElement(By.xpath("//select[@id='fruit-selects']//option[@value='orange']"));
        if (!select.isEnabled())
            System.out.println("Disabled");
        driver.close();

    }

}

