package testcase;

import base.DriverSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleVerify extends DriverSetup {
    public static String baseUrl="http://automationpractice.com/index.php";

    @Test(priority=1)
    public static void verifyTitle() throws InterruptedException
    {
        driver.get(baseUrl);
        //new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        String actualTitleOfTheSite=driver.getTitle();
        //String titleOfThePage=driver.getTitle();
        System.out.println("The Title of the site is: "+ actualTitleOfTheSite);
        //Thread.sleep(2000);

        Assert.assertEquals("My Stores", actualTitleOfTheSite);
    }
    //--------------------------------------------------------------------------
    @Test(priority=2)
    public static void isWebsiteSecured() throws InterruptedException
    {
        String y=driver.getCurrentUrl();
        if (y.contains("https"))
        {
            System.out.println("Site is secured");
        }else
        {
            System.out.println("Site is not secured");
        }
        Thread.sleep(2000);
    }

}
