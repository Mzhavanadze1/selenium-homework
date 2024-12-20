package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Google {
    @FindBy(xpath = "//*[@id='W0wltc']")
   public WebElement acceptButton;

    @FindBy(xpath = "//*[@id='APjFqb']")
    public WebElement input;

    @FindBy(xpath = "//*[@id='slim_appbar']")
    public WebElement googleBar;
}
