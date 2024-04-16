package POM.elements;

import POM.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElement extends BasePage {
    public LoginElement(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[text()='Sign in']")
    public WebElement singinsHome;
    @FindBy(xpath = "//input[@id='login_email']")
    public WebElement pathEmail;
    @FindBy(xpath = "//input[@id='login_pass']")
    public WebElement pathPassword;
    @FindBy(xpath = "//input[@id='LoginButton']")
    public WebElement btnLogin;
    @FindBy(xpath = "//div[@id='TopMenu']//a[text()='Sign out']")
    public WebElement pathLogout;
    @FindBy(xpath = "//form[@id='customer_login']/div[@class='form-signup']")
    public WebElement pathErrorLogin;
    @FindBy(xpath = "//form[@id='customer_login']/div[1]")
    public WebElement pathErrorPassword;
    @FindBy(xpath = "//form[@id='customer_login']/div[@class='form-signup']")
    public WebElement pathErrorAllNull;
    @FindBy(xpath = "//form[@id='customer_login']/div[@class='form-signup']")
    public WebElement pathErrorEmail;


    public String strPathLogin(){
        return "//a[text()='Sign in']";
    }
    public String strPathLogout(){
        return "//ul[@class='list-inline f-right']//a[text()='Đăng xuất']";
    }
}
