package SelenideTests;

import Elements.Selenide.SortableTable;
import Steps.SelenideStep.ToDoListSteps;
import org.testng.annotations.Test;

public class ToDoListTest extends SortableTable {

    ToDoListSteps steps=new ToDoListSteps();
    @Test
    public void tasksTest(){
        steps.openToDo();
        steps.clickBtn();
        steps.addAndCheckTask("Task");
        steps.checkListOrdering();
    }
}


