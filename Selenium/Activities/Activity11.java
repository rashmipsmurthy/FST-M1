package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) {
        // Installing Geeko Driver
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the Page" + driver.getTitle());

//Find the checkbox
        WebElement Checkbox1 = driver.findElement(By.name("toggled"));
        Checkbox1.click();

        System.out.println("Check box is selected" + Checkbox1.isSelected());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        // Click the button again
        Checkbox1.click();

        System.out.println("Check box is Deselected" + Checkbox1.isSelected());

        //click the checkbox



        // Close the browser
        driver.close();
    }
}


