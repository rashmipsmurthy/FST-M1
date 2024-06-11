package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        // Installing Geeko Driver
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://v1.training-support.net/selenium/ajax");
        System.out.println("Title of the Page" + driver.getTitle());

//Find the checkbox
        driver.findElement(By.cssSelector("button.violet")).click();
        // Wait for the new elements to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        // Find and print the new text
        String text = driver.findElement(By.tagName("h1")).getText();
        System.out.println(text);

        WebElement delayedText = driver.findElement(By.tagName("h3"));
        System.out.println(delayedText.getText());
        // Wait for the delayed text and print it
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        String lateText = driver.findElement(By.tagName("h3")).getText();
        System.out.println(lateText);
        // Close the browser
        driver.close();
}
    }

