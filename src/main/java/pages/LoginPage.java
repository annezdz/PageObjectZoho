package pages;

import base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;

public class LoginPage extends Page {


    public ZooAppPage doLogin(String username, String password){

        type("email_XPATH",username);
        //click("maisOpcoes_XPATH");
        type("senha_XPATH", password);
//
//        WebDriverWait wait = new WebDriverWait(driver, 10L);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']"))).sendKeys(password);
        click("iniciarSessaoBtn_XPATH");
        return new ZooAppPage();
    }

    public void goToSalesAndMarketing(){

    }

    public void goToFinance(){

    }
}
