package Elements.Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgressBar {
    @FindBy(id = "startStopButton")
    public WebElement startbtn;

    @FindBy(className = "progress-bar")
    public  WebElement progressBar;
}
