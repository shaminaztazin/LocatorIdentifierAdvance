package testcase;

import base.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class KeyboardEvent extends DriverSetup {
    public static String baseUrl = "http://automationpractice.com/index.php";

    @Test
    public static void KeyboardEventCheck() throws InterruptedException {

        driver.get(baseUrl);
        //new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        Thread.sleep(3000);
        WebElement e=driver.findElement(By.xpath("//input[@id='search_query_top']"));
        Thread.sleep(3000);
        e.sendKeys(Keys.chord(Keys.SHIFT,"tedtalk"));
        //driver.findElement(locator).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.DELETE));
        Thread.sleep(3000);
        e.sendKeys(Keys.chord(Keys.ENTER));
        Thread.sleep(3000);
    }
}
