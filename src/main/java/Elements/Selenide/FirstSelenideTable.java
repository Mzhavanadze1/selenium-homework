package Elements.Selenide;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class FirstSelenideTable {


        public ElementsCollection tableData = $$x("//*[@id=\"table1\"]/tbody/tr");
        public ElementsCollection Frank = $$x("//*[@id=\"table1\"]/tbody/tr/td[2]");
    }



