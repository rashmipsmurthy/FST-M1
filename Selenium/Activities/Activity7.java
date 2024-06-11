package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Activity7 {
    public static void main(String[] args) {
        // Installing Geeko Driver
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("Title of the Page" + driver.getTitle());

//Find the ball
        WebElement Ball = driver.findElement(By.id("draggable"));
        WebElement Drop1 = driver.findElement(By.id("droppable"));
        WebElement Drop2 = driver.findElement(By.id("dropzone2"));
        builder.click().pause(1000).build().perform();

        // Perform drag and drop to dropzone 1
        builder.clickAndHold(Ball).moveToElement(Drop1).pause(2000).release().build().perform();

        // Verify that the ball was dropped in dropzone 1
        String dropzone1Verify = Drop1.findElement(By.tagName("p")).getText();
        if(dropzone1Verify.equals("Dropped!")) {
            System.out.println("Ball was dropped in dropzone 1");
        }

        // Perform drag and drop to dropzone 2

        // Perform drag and drop to dropzone 2

        builder.dragAndDrop(Ball, Drop2).build().perform();
        // Verify that the ball was dropped in dropzone 2
        String dropzone2Verify = Drop2.findElement(By.tagName("p")).getText();
        if(dropzone2Verify.equals("Dropped!")) {
            System.out.println("Ball was dropped in dropzone 2");

        // Close the browser
        driver.close();
    }
}



}
