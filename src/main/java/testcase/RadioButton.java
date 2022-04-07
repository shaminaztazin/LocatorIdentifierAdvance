package testcase;

import base.DriverSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RadioButton extends DriverSetup {
    public static String baseUrl = "https://jqueryui.com/checkboxradio";

    @Test
    public static void CheckBoxAndRadioButtonInFrame() throws InterruptedException {

        driver.get(baseUrl);
        //new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        Thread.sleep(5000);
        // Switch to Frame
        driver.switchTo().frame(0);
        // Operate Elements
        //driver.findElement(By.xpath("(//span[contains(@class,'checkboxradio')])[5]")).click();
        driver.findElement(By.xpath("//body/div[1]/fieldset[1]/label[3]")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[4]/span[1]")).click();
        //body[1]/div[1]/fieldset[2]/label[4]/span[1]
        Thread.sleep(5000);
        // Back to page
        driver.switchTo().defaultContent();
        // Close site
        driver.close();
    }


}
