package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        // Installing Geeko Driver
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the Page" + driver.getTitle());

//Find the checkbox
        WebElement Checkbox = driver.findElement(By.id("dynamicCheckbox"));
        Checkbox.click();
        // Wait for the toggleButton to disappear
        WebElement dynamicBox = driver.findElement(By.id("dynamicCheckbox"));
        Checkbox.click();
        wait.until(ExpectedConditions.invisibilityOf(dynamicBox));
        System.out.println(dynamicBox.isDisplayed());
        // Click the button again
        Checkbox.click();
        // Wait for the element to appear
        wait.until(ExpectedConditions.visibilityOf(dynamicBox));
        System.out.println(dynamicBox.isDisplayed());
                       // Close the browser
        driver.close();
    }


}
