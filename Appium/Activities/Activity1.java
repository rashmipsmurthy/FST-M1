package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity1 {

    //Driver Declaration

    AndroidDriver driver;

    //set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.calculator2");
        options.setAppActivity(".Calculator");
        options.noReset();

    //Set the Appirum server URL
     URL serverUrl = new URL("http://localhost:4723/wd/hub");

        //Initializae the Android Driver
        driver = new AndroidDriver(serverUrl, options);
         }


@Test
    public void multiplyTest() {
    //Find the number 9 and tap it

    driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_9")).click();

    //Find the nmultiply and tap it
    driver.findElement(AppiumBy.id("com.android.calculator2:id/op_mul")).click();
    driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_5")).click();

    String result = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
    System.out.println(result);
    //Find the Equal
    driver.findElement(AppiumBy.id("com.android.calculator2:id/eq")).click();

    //Get the results and assert

        Assert.assertEquals(result, "45");

}
@AfterClass
public  void tearDown() {
        driver.quit();

    }
}
