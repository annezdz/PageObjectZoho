package accounts;

import base.Page;
import base.TopMenu;
import org.openqa.selenium.By;

public class CreateAccountPage extends Page {


    public void createAccountPage(String name){
        driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTNAME']")).sendKeys(name);
    }
}
