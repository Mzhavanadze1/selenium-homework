package Steps.SelenideStep;

import Elements.Selenide.DynamicContent;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.open;

public class DynamicContenSteps extends DynamicContent {

    public void link() {
        open("https://the-internet.herokuapp.com/");

    }

    public void clickBtn() {
        dynamicBtn.click();
    }


    public void refreshAndCheck() {
        for (int i = 0; i < 3; i++) {
            String beforReshDiv1 = textDiv1.getText();
            String beforReshDiv2 = textDiv2.getText();
            String beforReshDiv3 = textDiv3.getText();

            String imgSrc1=img1.getAttribute("src");
            String imgSrc2=img2.getAttribute("src");
            String imgSrc3=img3.getAttribute("src");

            Selenide.refresh();
            textDiv1.shouldNotHave(Condition.text(beforReshDiv1));
            textDiv2.shouldNotHave(Condition.text(beforReshDiv2));
            textDiv3.shouldNotHave(Condition.text(beforReshDiv3));

            img1.shouldNotHave(Condition.attribute("src",imgSrc1));
            img2.shouldNotHave(Condition.attribute("src",imgSrc2));
            img3.shouldNotHave(Condition.attribute("src",imgSrc3));


            System.out.println("After refreshing, texts are different!");

        }


    }
}




