package Steps.SeleniumStep;

import Elements.Selenium.WebdriverPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WebdriverPageSteps extends WebdriverPage {
    WebDriver driver;

    public void setUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void openLink() {
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
    }

    public Boolean checkDropdown() {
        dropdownbtn.click();
        pythonbtn.click();
        return pythonbtn.isSelected();


    }

    public void clickCheckBoxes() {

        for (WebElement element : checkBoxes) {
            if (!element.isSelected()) {
                element.click();
            }
        }
    }

    public boolean clickSelect() {
        radioBtn.click();
        return select.isEnabled();
    }

}
