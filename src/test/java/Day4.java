import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day4 {

    @Test
    public static void StaticTable() {
        System.setProperty("web driver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/tables");
        Boolean frank_exist = false;

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
        for (WebElement row : rows) {
            String name = row.findElement(By.xpath("./td[2]")).getText();
            if (name.equals("Frank")) {
                frank_exist = true;
            }
            String due = row.findElement(By.xpath("./td[4]")).getText();
            System.out.println("Name: " + name + ", " + "Due: " + due);
        }
        Assert.assertTrue(frank_exist);
        driver.close();


    }

    @Test
    public static void HoverMeToSee() {
        System.setProperty("web driver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/tool-tips");
        Actions action = new Actions(driver);
        WebElement Button = driver.findElement(By.id("toolTipButton"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Button);
        action.moveToElement(Button).build().perform();
        WebElement tooltip = driver.findElement(By.className("tooltip-inner"));
        Assert.assertTrue(tooltip.isDisplayed());
        driver.close();
    }

    @Test
    public static void Robot() throws AWTException, InterruptedException {
        System.setProperty("web driver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        Robot robot = new Robot();
        driver.findElement(By.xpath("//*[@id=\"W0wltc\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
        String text = "Selenium Robot Class example";
        for (Character symbol : text.toCharArray()) {
            int key = KeyEvent.getExtendedKeyCodeForChar(symbol);
            robot.keyPress(key);
            robot.keyRelease(key);
            Thread.sleep(20);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(By.xpath("//*[@id=\"slim_appbar\"]")).click();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);

        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        driver.close();
    }

}

