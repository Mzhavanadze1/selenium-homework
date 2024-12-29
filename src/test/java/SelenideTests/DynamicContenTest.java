package SelenideTests;

import Drivers.SelenideDriver;
import Steps.SelenideStep.DynamicContenSteps;
import org.testng.annotations.Test;

public class DynamicContenTest extends SelenideDriver {

    DynamicContenSteps steps=new DynamicContenSteps();
    @Test
    public void CheckDifAfterRefresh(){
        steps.link();
        steps.clickBtn();
        steps.refreshAndCheck();
    }
}
