package pages.crm;

import base.Page;
import base.TopMenu;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.FileNotFoundException;

public class AccountsPage extends Page {

    TopMenu menu = new TopMenu(driver);


    public CreateAccountPage goToCreateAccounts()  {

        click("criarContaBtn_XPATH");
        return new CreateAccountPage();
    }
}
