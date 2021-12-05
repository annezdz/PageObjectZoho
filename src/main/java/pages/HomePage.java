package pages;

import base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {


    public void goToSUpport(){
        driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/a[2]")).click();
    }

    public void goToSignUp(){
        driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
    }

    public LoginPage goToLogin(){
        driver.findElement(By.xpath("//a[@class='zh-login']")).click();
        return new LoginPage();
    }

    public void goToZohoEdu(){

    }

    public void goToLearnMore(){

    }

    public void validateFooterLinks(){}

}
