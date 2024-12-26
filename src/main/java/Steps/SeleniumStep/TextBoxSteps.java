package Steps.SeleniumStep;

import Elements.Selenium.TextBox;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TextBoxSteps extends TextBox {
    WebDriver driver;

    public void setUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void openLink() {
        driver.get("https://demoqa.com/text-box");
    }

    public void scrollToBtn() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        Thread.sleep(3000);

    }



}
