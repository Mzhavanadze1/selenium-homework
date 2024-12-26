package Drivers;

import com.codeborne.selenide.Configuration;

public class SelenideDriver {
    public void SetUpDriver (){
        Configuration.browser = "chrome";

    }
}
