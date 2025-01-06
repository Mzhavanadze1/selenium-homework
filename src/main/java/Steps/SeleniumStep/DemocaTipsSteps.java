package Steps.SeleniumStep;

import Elements.Selenium.DemocaTips;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class DemocaTipsSteps extends DemocaTips {
    WebDriver driver;


    public void setUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void openLink(){
        driver.get("https://demoqa.com/tool-tips");
    }

    public void scrollTobutton(){
        Actions actions=new Actions(driver);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",hoverButton);
        actions.moveToElement(hoverButton).build().perform();

        }


    }


