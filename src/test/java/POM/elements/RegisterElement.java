package POM.elements;

import POM.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterElement extends BasePage {
    public RegisterElement(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Create an account']")
    public WebElement createAcountsHome;
    @FindBy(xpath = "//input[@id='FormField_1']")
    public WebElement pathInputEmail;
    @FindBy(xpath = "//input[@id='FormField_2']")
    public WebElement pathInputPass;
    @FindBy(xpath = "//input[@id='FormField_3']")
    public WebElement pathInputConfigPass;
    @FindBy(xpath = "//select[@id='FormField_11']")
    public WebElement pathSelectCountry;
    @FindBy(xpath = "//input[@id='FormField_4']")
    public WebElement pathFistName;

    @FindBy(xpath = "//input[@id='FormField_5']")
    public WebElement pathLastName;
    @FindBy(xpath = "//input[@id='FormField_8']")
    public WebElement pathAddress1;
    @FindBy(xpath = "//input[@id='FormField_9']")
    public WebElement pathAddress2;
    @FindBy(xpath = "//input[@id='FormField_6']")
    public WebElement pathCompany;
    @FindBy(xpath = "//input[@id='FormField_10']")
    public WebElement pathCity;
    @FindBy(xpath = "//select[@id='FormField_12']")
    public WebElement pathState;
    @FindBy(xpath = "//input[@id='FormField_13']")
    public WebElement pathZip;
    @FindBy(xpath = "//input[@id='FormField_13']")
    public WebElement pathPhoneNumber;
    @FindBy(xpath = "//div[@class='recaptcha-checkbox-borderAnimation']")
    public WebElement pathTick;
    @FindBy(xpath = "//input[@class='btn']")
    public WebElement pathBtnCreate;

    public String strpathRegister(){
        return "//ul[@class='list-inline f-right']/li/a[text()='Đăng ký']";
    }
    public String strpathLogout(){
        return "//ul[@class='list-inline f-right']/li/a[text()='Đăng xuất']";
    }

}
