package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/");
    }

    @Test(priority = 1)
    public void homepage() {
        //Title of the pagge
        String Title = driver.getTitle();
        System.out.println("Title of the page" + Title);
        Assert.assertEquals("Training Support", Title);
        driver.findElement(By.id("about-link")).click();
        System.out.println("New titel of the page:" + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "About Training Support");

    }
        @AfterClass
        public void afterMethod() {
            //Close the browser
            driver.quit();
        }

    }



