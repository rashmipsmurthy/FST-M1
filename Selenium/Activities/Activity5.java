package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) {
        // Installing Geeko Driver
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/input-events");

        String pageTitle = driver.getTitle();
        System.out.println(" Title:" + pageTitle);
        //Perform left click()
        builder.click().pause(1000).build().perform();

        //print front text
        String fronttext = driver.findElement(By.className("active")).getText();
        System.out.println("Left click: " +fronttext);


        //Perform double click()
        builder.doubleClick().pause(1000).build().perform();

        //print front text
        String number = driver.findElement(By.className("active")).getText();
        System.out.println("Double click: " +number);

        //Perform Right click()
        builder.contextClick().pause(1000).build().perform();

        //print front text
        String number1 = driver.findElement(By.className("active")).getText();
        System.out.println("Right Click: " +number1);

       // Close the browser
        driver.close();
    }
}
