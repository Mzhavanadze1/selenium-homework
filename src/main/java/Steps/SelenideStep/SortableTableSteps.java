package Steps.SelenideStep;

import Elements.Selenide.SortableTable;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.open;

public class SortableTableSteps extends SortableTable {
    public void openLink(){
        open("https://the-internet.herokuapp.com/");
    }

    public void clickBtn(){
        btn.click();

    }
    public void checkData(){
        ElementsCollection filteredData = dataTable.filter(Condition.text("Doe"));
        filteredData.shouldHave(CollectionCondition.texts("jdoe@hotmail.com"));
        firstNameHeader.click();
        dataTable.first().shouldHave(Condition.text("Frank"));
    }


}
