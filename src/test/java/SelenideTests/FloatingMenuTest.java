package SelenideTests;

import Drivers.SelenideDriver;
import Steps.SelenideStep.FloatingMenuSteps;
import org.testng.annotations.Test;

public class FloatingMenuTest extends SelenideDriver {

    FloatingMenuSteps steps=new FloatingMenuSteps();
@Test
    public void isMenuVisile() throws InterruptedException {
        steps.link();
        steps.clickFloatingBtn();
        steps.scrollToEnd();
        steps.menuVisibility();
        Thread.sleep(1000);

    }
}
