package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity22 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
        //Actions builder
        Actions builder = new Actions(driver);


        // Open the page
        driver.get("https://v1.training-support.net/selenium/popups");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        WebElement button = driver.findElement(By.className("orange"));
        // Hover over the button
        builder.moveToElement(button).build().perform();
        String tooltip = button.getAttribute("data-tooltip");

        //click on the button
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        //enter the credntials;
        username.sendKeys("admin");
        username.sendKeys("password");

        WebElement confirm = driver.findElement(By.xpath("//button[text()= 'Log in']"));

        //driver.findElement(By.ByClassName("green")).click();
        driver.findElement(By.xpath("//button[text()= 'Log in']")).click();
        String Message1 = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login Message:" + Message1);
        // Close the browser
        driver.quit();
    }

}
