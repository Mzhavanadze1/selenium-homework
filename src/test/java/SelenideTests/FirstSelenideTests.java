package SelenideTests;

import Drivers.SelenideDriver;
import Steps.SelenideStep.FirstSelenideTableSteps;
import org.testng.annotations.Test;

public class FirstSelenideTests extends SelenideDriver {
    @Test
    public void getTableInfo(){
        FirstSelenideTableSteps tableSteps=new FirstSelenideTableSteps();
        tableSteps.openChrome();
        tableSteps.tableRows("Frank");
    }
}
