package POM.page;

import POM.core.BasePage;
import POM.elements.LoginElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
    LoginElement loginElement = new LoginElement(driver);
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void TestLogin() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginElement.strPathLogin())));
        loginElement.singinsHome.click();
        loginElement.pathEmail.sendKeys("testemail11@gmail.com");
        loginElement.pathPassword.sendKeys("123456");
        loginElement.btnLogin.click();
        Thread.sleep(5000);
//        String Log = loginElement.pathmyAcount.getText();
//        if(Log.contains("Tài khoản của tôi")) {
//            System.out.println("Test passed. ");
//        } else {
//            System.out.println("Test failed. ");
//        }
        loginElement.pathLogout.click();
    }

    public void TestLoginWithPasswordError(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginElement.strPathLogout())));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginElement.strPathLogin())));
        loginElement.singinsHome.click();
        loginElement.pathEmail.sendKeys("testemail11@gmail.com");
        loginElement.pathPassword.sendKeys("123456yty78");
        loginElement.btnLogin.click();
        boolean logoutClicked = false;
        try {
            loginElement.pathLogout.click();
            // Nếu không có ngoại lệ được ném, có nghĩa là click vào pathLogout thành công
            // Đặt biến logoutClicked thành true
            logoutClicked = true;
        } catch (Exception e) {
            // Nếu có ngoại lệ được ném, có nghĩa là click vào pathLogout thất bại
            // Không cần làm gì ở đây vì biến logoutClicked vẫn giữ giá trị false
        }

        // Kiểm tra giá trị của biến logoutClicked để quyết định test pass hay fail
        if (logoutClicked) {
            // Nếu logoutClicked là true (click vào pathLogout thành công), thì test fail
            throw new AssertionError("Logout button clicked successfully but it should fail.");
        } else {
            // Nếu logoutClicked là false (không click được vào pathLogout), thì test pass
            System.out.println("Logout button not clicked, as expected.");
        }
    }

    public void TestLoginWithPasswordNull(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginElement.strPathLogin())));
        loginElement.singinsHome.click();
        loginElement.pathEmail.sendKeys("testemail11@gmail.com");
        loginElement.pathPassword.sendKeys("");
        loginElement.btnLogin.click();
        boolean logoutClicked = false;
        try {
            loginElement.pathLogout.click();
            // Nếu không có ngoại lệ được ném, có nghĩa là click vào pathLogout thành công
            // Đặt biến logoutClicked thành true
            logoutClicked = true;
        } catch (Exception e) {
            // Nếu có ngoại lệ được ném, có nghĩa là click vào pathLogout thất bại
            // Không cần làm gì ở đây vì biến logoutClicked vẫn giữ giá trị false
        }

        // Kiểm tra giá trị của biến logoutClicked để quyết định test pass hay fail
        if (logoutClicked) {
            // Nếu logoutClicked là true (click vào pathLogout thành công), thì test fail
            throw new AssertionError("Logout button clicked successfully but it should fail.");
        } else {
            // Nếu logoutClicked là false (không click được vào pathLogout), thì test pass
            System.out.println("Logout button not clicked, as expected.");
        }
    }

    public void TestLoginWithAllNull(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginElement.strPathLogin())));
        loginElement.singinsHome.click();
        loginElement.pathEmail.sendKeys("");
        loginElement.pathPassword.sendKeys("");
        loginElement.btnLogin.click();
        boolean logoutClicked = false;
        try {
            loginElement.pathLogout.click();
            // Nếu không có ngoại lệ được ném, có nghĩa là click vào pathLogout thành công
            // Đặt biến logoutClicked thành true
            logoutClicked = true;
        } catch (Exception e) {
            // Nếu có ngoại lệ được ném, có nghĩa là click vào pathLogout thất bại
            // Không cần làm gì ở đây vì biến logoutClicked vẫn giữ giá trị false
        }

        // Kiểm tra giá trị của biến logoutClicked để quyết định test pass hay fail
        if (logoutClicked) {
            // Nếu logoutClicked là true (click vào pathLogout thành công), thì test fail
            throw new AssertionError("Logout button clicked successfully but it should fail.");
        } else {
            // Nếu logoutClicked là false (không click được vào pathLogout), thì test pass
            System.out.println("Logout button not clicked, as expected.");
        }
    }

    public void TestLoginWithEmailError(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginElement.strPathLogin())));
        loginElement.singinsHome.click();
        loginElement.pathEmail.sendKeys("trangtt@gmail.com");
        loginElement.pathPassword.sendKeys("");
        loginElement.btnLogin.click();
        boolean logoutClicked = false;
        try {
            loginElement.pathLogout.click();
            // Nếu không có ngoại lệ được ném, có nghĩa là click vào pathLogout thành công
            // Đặt biến logoutClicked thành true
            logoutClicked = true;
        } catch (Exception e) {
            // Nếu có ngoại lệ được ném, có nghĩa là click vào pathLogout thất bại
            // Không cần làm gì ở đây vì biến logoutClicked vẫn giữ giá trị false
        }

        // Kiểm tra giá trị của biến logoutClicked để quyết định test pass hay fail
        if (logoutClicked) {
            // Nếu logoutClicked là true (click vào pathLogout thành công), thì test fail
            throw new AssertionError("Logout button clicked successfully but it should fail.");
        } else {
            // Nếu logoutClicked là false (không click được vào pathLogout), thì test pass
            System.out.println("Logout button not clicked, as expected.");
        }
    }
}
