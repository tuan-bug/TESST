package POM.page;

import POM.core.BasePage;
import POM.elements.AddProductElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddProductPage extends BasePage {
    AddProductElement addProductElement = new AddProductElement(driver);
    public AddProductPage(WebDriver driver) {
        super(driver);
    }

    public void AddProductToCart(){
        addProductElement.pathProductPlant.click();
        //addProductElement.pathAddToCart.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addProductElement.pathCLose())));
        addProductElement.pathModalClose.click();
        addProductElement.itemsHome.click();
        boolean isProductInCart = addProductElement.checkCart.isDisplayed();

        // Hiển thị thông báo tương ứng
        if(isProductInCart) {
            System.out.println("Có sản phẩm trong giỏ hàng.");
        } else {
            System.out.println("Không có sản phẩm trong giỏ hàng.");
        }
    }
    public void AddManyProductToCart(){
        addProductElement.logoClick.click();
        /// sản phẩm 1 vào giỏ hàng
        //addProductElement.plantsHome.click();
        addProductElement.pathProductPlant.click();
        addProductElement.pathAddToCart.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addProductElement.pathCLose())));
        addProductElement.pathModalClose.click();

        addProductElement.logoClick.click();
        /// sản phẩm 2 vào giỏ hàng
        //addProductElement.roseHome.click();
        addProductElement.pathProductRose.click();
        addProductElement.pathAddToCart.click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addProductElement.pathCLose())));
        addProductElement.pathModalClose.click();

        addProductElement.itemsHome.click();
        boolean isProductInCart = addProductElement.checkCart.isDisplayed();

        // Hiển thị thông báo tương ứng
        if(isProductInCart) {
            System.out.println("Có sản phẩm trong giỏ hàng.");
        } else {
            System.out.println("Không có sản phẩm trong giỏ hàng.");
        }
    }
}
