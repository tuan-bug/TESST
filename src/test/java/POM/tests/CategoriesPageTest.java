package POM.tests;

import POM.core.BaseTest;
import POM.page.CategoriesPage;
import org.testng.annotations.Test;

public class CategoriesPageTest extends BaseTest {

    @Test
    public void Test1(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryPlants();
    }
    @Test
    public void Test2(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryRose();
    }
    @Test
    public void Test3(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryCandy();
    }
    @Test
    public void Test4(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryPlush();
    }
    @Test
    public void Test5(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryArrangement();
    }
    @Test
    public void Test6(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategorySympathy();
    }
    @Test
    public void Test7(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryWedding();
    }
    @Test
    public void Test8(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryReception();
    }
    @Test
    public void Test9(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryContact();
    }
    @Test
    public void Test10(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryRoseShop();
    }
    @Test
    public void Test11(){
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        categoriesPage.clickCategoryReturn();
    }
}
