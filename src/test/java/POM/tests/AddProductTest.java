package POM.tests;

import POM.core.BaseTest;
import POM.page.AddProductPage;
import org.testng.annotations.Test;

public class AddProductTest extends BaseTest {
    @Test
    public void Test1(){
        AddProductPage addProductPage = new AddProductPage(getDriver());
        addProductPage.AddProductToCart();
    }
    @Test
    public void Test2(){
        AddProductPage addProductPage = new AddProductPage(getDriver());
        addProductPage.AddManyProductToCart();
    }
}
