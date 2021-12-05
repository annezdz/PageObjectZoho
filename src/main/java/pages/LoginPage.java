package pages;

import base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Page {


    public ZooAppPage doLogin(String username, String password){

        driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys(username);
        driver.findElement(By.xpath("//span[normalize-space()='Seguinte']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10L);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']"))).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Iniciar sessão')]")).click();

        return new ZooAppPage();
    }

    public void goToSalesAndMarketing(){

    }

    public void goToFinance(){

    }
}
