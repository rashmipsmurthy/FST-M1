package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {
    public static void main(String[] args) {
        // Installing Geeko Driver
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the Page" + driver.getTitle());

//Find the text box
        WebElement Textbox = driver.findElement(By.id("input-text"));
        System.out.println("Text box is selected" + Textbox.isEnabled());
        WebElement enableinput = driver.findElement(By.id("toggleInput"));
        enableinput.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
        System.out.println("Enableinput" + enableinput.isEnabled());

         // Close the browser
        driver.close();
    }
}

