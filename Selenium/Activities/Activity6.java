package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.time.Duration;

public class Activity6 {
    public static void main(String[] args) {
        // Installing Geeko Driver
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Title of the Page" + driver.getTitle());

//Press the key
        builder.sendKeys("J").build().perform();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

//Press the CTRL+A and CTRLC
        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("C").keyUp(Keys.CONTROL);

        // Close the browser
        driver.close();
    }
}


