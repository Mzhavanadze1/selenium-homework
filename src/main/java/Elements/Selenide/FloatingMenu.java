package Elements.Selenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FloatingMenu {
    public SelenideElement floatBtn =$x("//*[@id=\"content\"]/ul/li[19]/a");

    public SelenideElement footer=$x("//*[@id=\"page-footer\"]/div");

    public SelenideElement menu= $("#menu");

}
