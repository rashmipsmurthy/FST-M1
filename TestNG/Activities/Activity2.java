package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test(priority = 1)
    public void testcase1() {
        //Title of the pagge
        String Title = driver.getTitle();
        System.out.println("Title of the page" + Title);
        Assert.assertEquals("Target Practice", Title);
            }

    public void testcase2() {
        //Title of the pagge
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
    }

    @Test(enabled = false)
    public void testcase3() {
        //This test will be skipped and not counted
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }
    @Test(enabled = false)
    public void testcase4() {
        //This test will be skipped and will be be shown as skipped
        throw new SkipException("skipping the test case");
    }
    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}





