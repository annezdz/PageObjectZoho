package pages;

import base.Page;
import crm.CRMHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZooAppPage extends Page {


    public void goToClick(){
        if(driver.getPageSource().contains("Limite de início de sessão quase atingido")){
            driver.findElement(By.xpath("//a[normalize-space()='Sim, compreendo']")).click();

        }
        //driver.findElement(By.xpath("//a[normalize-space()='Sim, compreendo']")).click();
        driver.findElement(By.xpath("//span[@class='_logo-chat _logo-x96 zod-app-logo']")).click();
    }

    public void goToCalendar(){
        driver.findElement
                (By.xpath("//span[@class='_logo-calendar _logo-x96 zod-app-logo']")).click();
    }

    public void goToMail(){
        driver.findElement
                (By.xpath("//span[@class='_logo-mail _logo-x96 zod-app-logo']")).click();
    }

    public CRMHomePage goToCRM(){
        driver.findElement(By.
                xpath("//span[@class='_logo-crm _logo-x96 zod-app-logo']")).click();
        return new CRMHomePage();
    }
}
