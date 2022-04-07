package testcase;

import base.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LocatorLearning2 extends DriverSetup {
    static String baseUrl="https://rahulshettyacademy.com/locatorspractice/";

    @Test
    public void  locatorLearning() throws InterruptedException
    {
        driver.get(baseUrl);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.id("inputUsername")).sendKeys("mohoshi");;
        Thread.sleep(2000);

        driver.findElement(By.name("inputPassword")).sendKeys("passwordField");
        Thread.sleep(2000);

        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());;
        //Formula:    tagname.value (if class is given)
        //			  tagname#value (if id is given)

        Thread.sleep(2000);

        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("papel");
        //         //tagname[@attribute='value']

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("papel@gmail.com");
        //			tagname[attribute='value']

        //driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("01670102216");
        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("01670102216");
        Thread.sleep(2000);


        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        Thread.sleep(2000);

        String password=getPassword(driver);

        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("inputUsername")).sendKeys("mohoshi");;
        Thread.sleep(2000);

        driver.findElement(By.name("inputPassword")).sendKeys(password);
        Thread.sleep(2000);

        driver.findElement(By.id("chkboxOne")).click();

        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(2000);
    }

    public static String getPassword(WebDriver driver) throws InterruptedException
    {
        driver.get(baseUrl);
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText=driver.findElement(By.cssSelector("form p")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.
        String [] passwordArray=passwordText.split("'");
        //String [] passwordArray2=passwordArray[1].split("'");
        //String password=passwordArray2[0];

        String password=passwordArray[1].split("'")[0];

        return password;

    }
}


