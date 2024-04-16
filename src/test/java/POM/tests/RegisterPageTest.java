package POM.tests;

import POM.core.BaseTest;
import POM.page.RegisterPage;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {

    @Test
    public void Test1() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.TestRegister();
    }
    @Test
    public void Test2(){
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.TestRegisterEmailAlreadlyExists();
    }

    @Test
    public void Test3(){
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.TestRegisterInvalidEmail();
    }
    @Test
    public void Test4(){
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.TestRegisterWithWeakPassword();
    }

    @Test
    public void Test5(){
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.TestRegisterEmailNull();
    }

    @Test
    public void Test6(){
        RegisterPage registerPage = new RegisterPage(getDriver());
        //registerPage.TestRegisterAllNull();
    }
}
