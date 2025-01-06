package Steps.SeleniumStep;

import Elements.Selenium.Google;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GoogleSteps extends Google {
    WebDriver driver;


    public void setUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void openLink() {
        driver.get("https://www.google.com/");
    }

    public void robotActions() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        acceptButton.click();
        input.click();
        String text = "Selenium Robot Class example";
        for (Character symbol : text.toCharArray()) {
            int key = KeyEvent.getExtendedKeyCodeForChar(symbol);
            robot.keyPress(key);
            robot.keyRelease(key);
            Thread.sleep(20);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

       googleBar.click();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);

        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    }
}
