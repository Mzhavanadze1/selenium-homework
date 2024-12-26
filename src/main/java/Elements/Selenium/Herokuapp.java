package Elements.Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Herokuapp {
    @FindBy (xpath = "/html/body/div[2]/div/div[1]/form[2]/button")
   public WebElement button;

    @FindBy(id = "message")
    public WebElement message;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/form[2]/input")
    public WebElement input;




}
