package Steps.SelenideStep;

import Elements.Selenide.ToDoList;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ToDoListSteps extends ToDoList {

    public void openToDo(){
        open("https://webdriveruniversity.com/");
    }

    public void clickBtn(){
        toDoBtn.click();
        switchTo().window(1);
    }

    public void addAndCheckTask(String taskName){
        for (int i = 1; i<4; i++){
            String TaskFullName=taskName+i;
            input.sendKeys(TaskFullName);
            input.pressEnter();
            $x("//*[@id=\"container\"]/ul/" + "//@text()='" + TaskFullName+"'");

        }
        SelenideElement task2 = $x("//*[@id=\"container\"]/ul/li[5]/span/i");
        task2.hover().click();

    }

    public void checkListOrdering(){
        List<String> expectedList = List.of("Go to potion class", "Buy new robes", "Practice magic", "Task1", "Task3");
        ToDoItems.shouldHave(CollectionCondition.exactTexts(expectedList));
        ToDoItems.filter(Condition.text("Task2")).shouldHave(CollectionCondition.empty);

    }









}
