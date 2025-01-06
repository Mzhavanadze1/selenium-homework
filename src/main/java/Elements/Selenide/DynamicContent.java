package Elements.Selenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicContent {

    public SelenideElement dynamicBtn = $x("//*[@id=\"content\"]/ul/li[12]/a");
    public SelenideElement textDiv1 = $x("//*[@id=\"content\"]/div[1]/div[2]");
    public SelenideElement textDiv2=$x("//*[@id=\"content\"]/div[2]/div[2]");
    public SelenideElement textDiv3=$x("//*[@id=\"content\"]/div[3]/div[2]");

    public SelenideElement img1=$("#content > div:nth-child(1) > div.large-2.columns > img");
    public SelenideElement img2=$("#content > div:nth-child(4) > div.large-2.columns > img");
    public SelenideElement img3=$("#content > div:nth-child(7) > div.large-2.columns > img");



}
