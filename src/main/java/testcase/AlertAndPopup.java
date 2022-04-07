package testcase;

import base.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertAndPopup  extends DriverSetup {
    public static String baseUrl = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";

    @Test
    public static void alertHandlingCheck() throws InterruptedException {
        driver.get(baseUrl);
        //new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement b = driver.findElement(By.name("iframeResult"));
        driver.switchTo().frame(b);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(5000);
    }
}


