package Elements.Selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class ToDoList {
    public SelenideElement toDoBtn=$("#to-do-list > div > div.section-title > h1");

    public SelenideElement input=$("#container > input[type=text]");
    public ElementsCollection ToDoItems = $$x("//*[@id=\"container\"]/ul//li");

}
