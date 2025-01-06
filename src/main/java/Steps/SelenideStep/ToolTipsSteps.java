package Steps.SelenideStep;

import Elements.Selenide.ToolTips;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.open;

public class ToolTipsSteps extends ToolTips {

    public void openChrome(){
        open("https://demoqa.com/tool-tips");
    }

    public void moveTo(String value) throws InterruptedException {
        actions().moveToElement(howeToSeeBtn).build().perform();
        toolTipBtn.shouldHave(Condition.text(value));
        Thread.sleep(5000);

    }
}
