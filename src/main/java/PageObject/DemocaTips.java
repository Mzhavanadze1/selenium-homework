package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemocaTips {
    @FindBy(id = "toolTipButton")
     public WebElement hoverButton;

    @FindBy(className = "tooltip-inner")
    public WebElement toolTipButton;
}

