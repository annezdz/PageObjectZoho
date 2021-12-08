package pages;

import base.Page;
import pages.crm.CRMHomePage;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class ZooAppPage extends Page {

    public void goToClick(){
        if(driver.getPageSource().contains("Limite de início de sessão quase atingido")){
            driver.findElement(By.xpath("//a[normalize-space()='Sim, compreendo']")).click();

        }
        //driver.findElement(By.xpath("//a[normalize-space()='Sim, compreendo']")).click();
        driver.findElement(By.xpath("//span[@class='_logo-chat _logo-x96 zod-app-logo']")).click();
    }

    public void goToCalendar(){
       click("goToCalendar_XPATH");
    }

    public void goToMail(){
        driver.findElement
                (By.xpath("//span[@class='_logo-mail _logo-x96 zod-app-logo']")).click();
    }

    public CRMHomePage goToCRM() {
//        driver.findElement(By.
//                xpath("//span[@class='_logo-pages.crm _logo-x96 zod-app-logo']")).click();
        click("goToCRM_XPATH");
        return new CRMHomePage();
    }
}
