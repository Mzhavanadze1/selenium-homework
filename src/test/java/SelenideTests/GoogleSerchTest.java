package SelenideTests;

import Steps.SelenideStep.GoogleSearchSteps;
import org.testng.annotations.Test;

import java.awt.*;

public class GoogleSerchTest extends GoogleSearchSteps {

    GoogleSearchSteps steps = new GoogleSearchSteps();
    @Test
    public void googleSearchInfo() throws InterruptedException, AWTException {
        steps.googleLink();
        steps.doSearch();
    }
}
