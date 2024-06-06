package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        // Installing Geeko Driver
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net");


        String pageTitle = driver.getTitle();
        System.out.println("First Title:" + pageTitle);

        //To get link on about us
        driver.findElement(By.id("about-link")).click();
        System.out.println("About Us page Title:" + driver.getTitle());

        //to close the browser
        driver.close();
    }
}

