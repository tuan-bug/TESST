package POM.elements;

import POM.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddProductElement extends BasePage {
    public AddProductElement(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//div[@id='Logo']/a")
    public WebElement logoClick;
    @FindBy(xpath = "//div[@class='centerer']//a[text()='Plants']")
    public WebElement plantsHome;
    @FindBy(xpath = "//div[@class='centerer']//a[text()='Roses']")
    public WebElement roseHome;
    @FindBy(xpath = "//div[@class='ProductActionAdd']")
    public WebElement pathProductPlant;
    @FindBy(xpath = "//div[@class='ProductActionAdd']")
    public WebElement pathProductRose;
    @FindBy(xpath = "//div[@class='DetailRow']/input")
    public WebElement pathAddToCart;
    @FindBy(xpath = "//li[@class='last CartLink']/a")
    public WebElement itemsHome;
    @FindBy(xpath = "//a[@class='modalClose']")
    public WebElement pathModalClose;
    @FindBy(xpath = "//tr[@class='First Last Odd Even']/th[text()='Cart Items']")
    public WebElement checkCart;

    public String pathCLose(){
        return "//span[text()='×']";
    }

}
