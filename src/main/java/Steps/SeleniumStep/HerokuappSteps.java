package Steps.SeleniumStep;

import Elements.Selenium.Herokuapp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HerokuappSteps extends Herokuapp {
WebDriver driver;
    public void setUp(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickButton(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        button.click();
    }

    public String getText(){
        return message.getText();

    }

    public String getButtonText(){
        return button.getText();
    }

    public void sendKey(String value){
        input.sendKeys(value);

    }
    public void clear(){
        input.clear();
    }
}
