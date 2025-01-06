package Steps.SelenideStep;

import Elements.Selenide.FirstSelenideTable;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.CollectionCondition;

import static com.codeborne.selenide.Selenide.open;

public class FirstSelenideTableSteps extends FirstSelenideTable {
    public void openChrome() {
        open("https://the-internet.herokuapp.com/tables");

    }

    public void tableRows(String test_name) {

        for (SelenideElement row : tableData.stream().toList()) {
            String name = row.$x("./td[2]").text();
            String due = row.$x("./td[4]").text();
            System.out.println("Name: " + name + ", " + "Due: " + due);

        }
        Frank.shouldHave(CollectionCondition.itemWithText(test_name));
    }


}


