package Steps;

import PageObject.HerokuappTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HerokuappTableSteps extends HerokuappTable{
    WebDriver driver;


    public void setUp(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(this.driver, this);
    }

    public void openLink(){
        driver.get("https://the-internet.herokuapp.com/tables");
    }

    public boolean checkTableRows(){
        Boolean frank_exist = false;
        for (WebElement row : elemenets) {
            String name = row.findElement(By.xpath("./td[2]")).getText();
            if (name.equals("Frank")) {
                frank_exist = true;
            }
            String due = row.findElement(By.xpath("./td[4]")).getText();
            System.out.println("Name: " + name + ", " + "Due: " + due);
        }
        return frank_exist;
    }

}
