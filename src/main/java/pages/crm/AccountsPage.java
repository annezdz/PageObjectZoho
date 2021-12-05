package pages.crm;

import base.Page;
import base.TopMenu;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class AccountsPage extends Page {

    TopMenu menu = new TopMenu(driver);


    public CreateAccountPage goToCreateAccounts() throws FileNotFoundException {

        driver.findElement(By.xpath("//button[normalize-space()='Criar Conta']")).click();
        return new CreateAccountPage();
    }
}
