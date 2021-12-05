package testCases;

import com.aventstack.extentreports.reporter.configuration.Theme;
import pages.crm.AccountsPage;
import pages.crm.CreateAccountPage;
import base.Page;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ZooAppPage;

import java.io.FileNotFoundException;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws InterruptedException {
        HomePage home = new HomePage();
        LoginPage login = home.goToLogin();
      //  ZooAppPage zp = login.doLogin("annezdz@hotmail.com","anne280785");
       // zp.goToCRM();
    }
}
