package POM.page;

import POM.core.BasePage;
import POM.elements.HomePageElement;
import POM.elements.ListCategoriesElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CategoriesPage extends BasePage {
    HomePageElement homePageElement = new HomePageElement(driver);
    public CategoriesPage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    public void clickCategoryPlants(){
        homePageElement.plantsHome.click();
    }
    public void clickCategoryRose(){
        homePageElement.roseHome.click();
    }

    public void clickCategoryCandy(){
        homePageElement.candyHome.click();
    }
    public void clickCategoryPlush(){
        homePageElement.plushtHome.click();
    }

    public void clickCategoryArrangement(){
        homePageElement.arrangementsHome.click();
    }

    public void clickCategorySympathy(){
        homePageElement.sympathyHome.click();
    }

    public void clickCategoryWedding(){
        homePageElement.weddingHome.click();
    }

    public void clickCategoryReception(){
        homePageElement.receptionHomer.click();
    }

    public void clickCategoryContact(){
        homePageElement.contactHome.click();
    }

    public void clickCategoryRoseShop(){
        homePageElement.roseShopHome.click();
    }
    public void clickCategoryReturn(){
        homePageElement.returnHome.click();
    }
}
