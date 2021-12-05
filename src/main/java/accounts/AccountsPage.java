package accounts;

import base.Page;
import base.TopMenu;
import org.openqa.selenium.By;

public class AccountsPage extends Page {

    TopMenu menu = new TopMenu(driver);

    public CreateAccountPage goToCreateAccounts(){

        driver.findElement(By.xpath("//button[normalize-space()='Criar Conta']")).click();
        return new CreateAccountPage();
    }
}
