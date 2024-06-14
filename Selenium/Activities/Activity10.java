package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10 {
    public static void main(String[] args) {
        // Installing Geeko Driver
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the Page" + driver.getTitle());

//Find the checkbox
        WebElement Checkbox1 = driver.findElement(By.id("dynamicCheckbox"));
        WebElement togglecheckbox = driver.findElement(By.id("toggleCheckbox"));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("dynamicCheckbox")));
        System.out.println("Check box is displayed" + Checkbox1.isDisplayed());
        // Click the button again
        togglecheckbox.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println("Check box is displayed" + Checkbox1.isDisplayed());

        //click the checkbox

        driver.findElement(By.xpath("//input([@class='WillDisappear']")).click();

        // Close the browser
        driver.close();
    }
}



