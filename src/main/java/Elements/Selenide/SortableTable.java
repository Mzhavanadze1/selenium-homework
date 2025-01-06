package Elements.Selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class SortableTable {

    public SelenideElement btn = $("#content > ul > li:nth-child(41) > a");
    public ElementsCollection dataTable = $$x("//*[@id=\"table2\"]/tbody/tr");
    public SelenideElement firstNameHeader = $x("//*[@id=\"table2\"]/thead/tr/th[2]/span");

}
