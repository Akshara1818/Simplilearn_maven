package test;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.LoginPage;

 

public class Testcase1 {
	WebDriver driver;
    SoftAssert assertobj =new SoftAssert();
   
    
   
    
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/aksharaappannat/Downloads/chromedriver");
       
        
        driver = new ChromeDriver();
        
        driver.get("https://github.com/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
        
            
    }
    
    @Test
    public void LoginTest() throws IOException {
        LoginPage obj=  new LoginPage(driver);
        obj.Login("abc@xyz.com", "123abc");
    }
    @AfterMethod
    public void CloseBrowser() {
        driver.quit();
    }
    

 

}
	


