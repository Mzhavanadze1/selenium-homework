package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HerokuappTable {
    @FindAll(@FindBy(xpath = "//*[@id=\"table1\"]/tbody/tr"))
    public List<WebElement> elemenets;

}
