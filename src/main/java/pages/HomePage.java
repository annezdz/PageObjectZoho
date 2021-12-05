package pages;

import base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;

public class HomePage extends Page {


    public void goToSUpport(){
        driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/a[2]")).click();
    }

    public void goToSignUp(){
        driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
    }

    public LoginPage goToLogin() {
       click("loginLink_XPATH");
        return new LoginPage();
    }

    public void goToZohoEdu(){

    }

    public void goToLearnMore(){

    }

    public void validateFooterLinks(){}

}
