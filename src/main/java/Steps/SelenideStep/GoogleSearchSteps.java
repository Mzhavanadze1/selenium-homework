package Steps.SelenideStep;

import Elements.Selenide.GoogleSerch;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchSteps extends GoogleSerch {

    public void googleLink(){
        open("https://www.google.com");
    }

    public void doSearch() throws AWTException, InterruptedException {
        Robot robot= new Robot();
        acceptMess.click();
        googleSrch.click();
        String text = "Selenium Robot Class example";
        for(Character Symbol:text.toCharArray()){
            int key = KeyEvent.getExtendedKeyCodeForChar(Symbol);
            robot.keyPress(key);
            robot.keyRelease(key);
            Thread.sleep(20);

        }
        googleSrch.pressEnter();

        for (int i =0; i<25;i++){
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);

        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);






    }
}
