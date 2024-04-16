package POM.core;

// file base, khởi ta web

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

// base test là befortesst và afftertest
public class BaseTest {

    protected WebDriver driver ;
    @BeforeClass
    public void beforTest(){
        driver = new ChromeDriver();
        // Mở trang web
        driver.get("https://roseshop.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void affterTest(){
        driver.close();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
