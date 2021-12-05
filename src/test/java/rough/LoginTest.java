package rough;

import accounts.AccountsPage;
import accounts.CreateAccountPage;
import base.Page;
import crm.CRMHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import pages.HomePage;
import pages.LoginPage;
import pages.ZooAppPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {


    public static WebDriver driver;

    public static void main(String[] args) {

        HomePage home = new HomePage();
        LoginPage login = home.goToLogin();
        ZooAppPage zp = login.doLogin("annezdz@hotmail.com","anne280785");
        zp.goToCRM();
        AccountsPage accountsPage = Page.menu.goToAccounts();
        CreateAccountPage create = accountsPage.goToCreateAccounts();
        create.createAccountPage("Anne");
    }
}
