package testcase;

import base.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightContextClick extends DriverSetup {
    public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

    @Test(priority = 18)
    public static void doubleClickRightClick() throws InterruptedException {
        driver.get(baseUrl);
        //new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.switchTo().frame("iframeResult");

        Actions a = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//p[contains(text(),'The multiple attribute specifies that multiple opt')]"));
        a.doubleClick(ele).build().perform();
        Thread.sleep(3000);

        WebElement ele2 = driver.findElement(By.xpath("//body/form[1]/input[1]"));
        a.contextClick(ele2).build().perform();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();

        // click()
        // dragAndDrop( )
        // clickAndHold( )
        // keyDown( )
        // keyUp( )
        // release( )

        // build( )
        // perform();

    }
}
