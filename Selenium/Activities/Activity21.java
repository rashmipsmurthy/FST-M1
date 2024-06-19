package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity21 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/tab-opener");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the fields of the sign-up form
        // Find the dropdown
        System.out.println("Current tab: " + driver.getWindowHandle());
        WebElement prompt = driver.findElement(By.id("launcher"));
        prompt.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("Currently open windows" +driver.getWindowHandle());

        //switch focus
        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
                    }
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        //print the handle of the current tab
        System.out.println("Current Tab" + driver.getWindowHandle());
        System.out.println("Title of the page2," + driver.getTitle());
        String  Heading1 = driver.findElement(By.className("content")).getText();
        System.out.println(("Heading of the padge" + Heading1 ));
        driver.findElement(By.id("actionButton")).click();

        //Wait for the 3rd window

        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        System.out.println("Currently open windows" +driver.getWindowHandle());

        //switch focus
        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        //print the handle of the current tab
        System.out.println("Current Tab" + driver.getWindowHandle());
        System.out.println("Title of the page3," + driver.getTitle());
        String  Heading2 = driver.findElement(By.className("content")).getText();
        System.out.println(("Heading of the padge" + Heading2));


        //close the browse
        driver.quit();


    }

    }

