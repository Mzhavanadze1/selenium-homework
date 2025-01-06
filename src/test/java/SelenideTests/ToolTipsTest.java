package SelenideTests;

import Drivers.SelenideDriver;
import Steps.SelenideStep.ToolTipsSteps;
import org.testng.annotations.Test;

public class ToolTipsTest extends SelenideDriver{

    ToolTipsSteps steps=new ToolTipsSteps();
@Test
    public void mouseAction() throws InterruptedException {
        steps.openChrome();
        steps.moveTo("You hovered over the Button");

    }




}
