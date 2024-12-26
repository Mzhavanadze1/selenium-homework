package Elements.Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebdriverPage {
    @FindBy(xpath = "//select[@id='dropdowm-menu-1']")
    public WebElement dropdownbtn;

    @FindBy(xpath = "//option[@value='python']")
    public WebElement pythonbtn;

    @FindAll(@FindBy(xpath = "//div[@id='checkboxes']//label//input"))
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "//form[@id='radio-buttons']//input[@value='yellow']")
    public WebElement radioBtn;

    @FindBy(xpath = "//select[@id='fruit-selects']//option[@value='orange']")
    public WebElement select;

}
