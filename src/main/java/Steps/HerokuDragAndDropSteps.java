package Steps;

import PageObject.HerokuappDragAndDrop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HerokuDragAndDropSteps extends HerokuappDragAndDrop {
    WebDriver driver;
    public void setUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }



    public Boolean compareColumnHeight(){
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        return columnA.getSize().getHeight()==columnB.getSize().getHeight();
    }



}
