package SelenideTests;

import Drivers.SelenideDriver;
import Steps.SelenideStep.SortableTableSteps;
import org.testng.annotations.Test;

public class SortableTableTest extends SelenideDriver {

    SortableTableSteps steps=new SortableTableSteps();
@Test
    public void checkTableData(){
        steps.openLink();
        steps.clickBtn();
        steps.checkData();
    }

}


