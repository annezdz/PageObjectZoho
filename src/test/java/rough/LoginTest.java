package rough;

import pages.crm.AccountsPage;
import pages.crm.CreateAccountPage;
import base.Page;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.ZooAppPage;

import java.io.FileNotFoundException;

public class LoginTest {


    public static WebDriver driver;

    public static void main(String[] args) throws FileNotFoundException {

        HomePage home = new HomePage();
        LoginPage login = home.goToLogin();
        ZooAppPage zp = login.doLogin("annezdz@hotmail.com","anne280785");
        zp.goToCRM();
        AccountsPage accountsPage = Page.menu.goToAccounts();
        CreateAccountPage create = accountsPage.goToCreateAccounts();
        create.createAccountPage("Anne");
    }
}
