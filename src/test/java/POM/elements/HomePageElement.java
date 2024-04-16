package POM.elements;

import POM.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageElement extends BasePage {
    public HomePageElement(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//div[@id='Logo']")
    public WebElement logoClick;
    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement acountsHome;
    @FindBy(xpath = "//a[text()='Sign in']")
    public WebElement singinsHome;
    @FindBy(xpath = "//a[text()='Create an account']")
    public WebElement createAcountsHome;
    @FindBy(xpath = "//li[@class='last CartLink']/a")
    public WebElement itemsHome;
    @FindBy(xpath = "//div[@class='centerer']//a[text()='Plants']")
    public WebElement plantsHome;
    @FindBy(xpath = "//div[@class='centerer']//a[text()='Roses']")
    public WebElement roseHome;
    @FindBy(xpath = "//div[@class='centerer']//a[text()='Candy']")
    public WebElement candyHome;
    @FindBy(xpath = "//div[@class='centerer']//a[text()='Plush Animals']")
    public WebElement plushtHome;
    @FindBy(xpath = "//div[@class='centerer']//a[text()='Arrangements']")
    public WebElement arrangementsHome;
    @FindBy(xpath = "//div[@class='centerer']//a[text()='Sympathy']")
    public WebElement sympathyHome;
    @FindBy(xpath = "//div[@class='centerer']//a[text()='Wedding']")
    public WebElement weddingHome;
    @FindBy(xpath = "//div[@class='centerer']//a[text()='Reception Center ']")
    public WebElement receptionHomer ;
    @FindBy(xpath = "//div[@id='Menu']//span[text()='Contact Us & Hours']/..")
    public WebElement contactHome;
    @FindBy(xpath = "//div[@id='Menu']//span[text()='The Rose Shop']/..")
    public WebElement roseShopHome;
    @FindBy(xpath = "//div[@id='Menu']//span[text()='Delivery & Returns']/..")
    public WebElement returnHome;


    public String pathLogo(){
        return "//a[@class='logo-wrapper ']";
    }
    public String pathMenuProduct(){
        return "//ul[@class='nav nav-left']/li/a/span[text()='Sản phẩm']";
    }
    public String pathMenuIntroduce(){
        return "//ul[@class='nav nav-left']/li/a/span[text()='Giới thiệu']";
    }
    public String pathMenuNews(){
        return "//ul[@class='nav nav-left']/li/a/span[text()='Tin tức']";
    }
    public String pathMenuContact(){
        return "//ul[@class='nav nav-left']/li/a/span[text()='Liên hệ']";
    }
    public String pathAlert(){
        return "//div[@class='alert alert-success']";
    }
}
