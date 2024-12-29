package Steps.SelenideStep;

import Elements.Selenide.FloatingMenu;

import static com.codeborne.selenide.Selenide.open;

public class FloatingMenuSteps extends FloatingMenu {

    public void link(){
        open("https://the-internet.herokuapp.com/");
    }

    public void clickFloatingBtn(){
        floatBtn.click();
    }

    public void scrollToEnd(){
         footer.scrollTo();
    }

    public void menuVisibility(){
        menu.shouldBe().isDisplayed();
    }

}

