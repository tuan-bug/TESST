package POM.page;

import POM.core.BasePage;
import POM.elements.RegisterElement;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends BasePage {
    RegisterElement registerElement = new RegisterElement(driver);
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void TestRegister() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(registerElement.strpathRegister())));
        registerElement.createAcountsHome.click();
        Thread.sleep(5000);
        registerElement.pathInputEmail.sendKeys("Trần");
        registerElement.pathInputPass.sendKeys("Trang");
        registerElement.pathInputConfigPass.sendKeys("trang200112@gmail.com");


        registerElement.pathSelectCountry.click();
        //Xử l sau
        registerElement.pathFistName.sendKeys("Trần");
        registerElement.pathLastName.sendKeys("Trang");
        registerElement.pathAddress1.sendKeys("Trần");
        registerElement.pathAddress2.sendKeys("Trang");
        registerElement.pathCompany.sendKeys("Trần");
        registerElement.pathCity.sendKeys("dfgfd");
        registerElement.pathState.click();
        // xử lý sau

        registerElement.pathZip.sendKeys("Trần");
        registerElement.pathPhoneNumber.sendKeys("djb");
        registerElement.pathTick.click();

        registerElement.pathBtnCreate.click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(registerElement.strpathLogout())));
        //Xử lý tiếp
    }
    public void TestRegisterEmailAlreadlyExists(){


    }
    public void TestRegisterInvalidEmail(){

    }

    public void TestRegisterWithWeakPassword(){

    }

    public void TestRegisterEmailNull(){

    }
    public void TestRegisterPasswordNull(){

    }
    public void TestRegisterCountryNull(){

    }
    public void TestRegisterFistNameNull(){

    }
    public void TestRegisterLastNameNull(){

    }
    public void TestRegisterAddress1Null(){

    }
    public void TestRegisterCityNull(){

    }
    public void TestRegisterStateNull(){

    }
    public void TestRegisterZipNull(){

    }
    public void TestRegisterPhoneNull(){

    }
    public void TestRegisterRequiredNull(){

    }
    public void TestRegisterNotRequiredNull(){

    }
}
