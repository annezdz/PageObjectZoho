package testCases;

import com.aventstack.extentreports.reporter.configuration.Theme;
import pages.crm.AccountsPage;
import pages.crm.CreateAccountPage;
import base.Page;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ZooAppPage;
import utilities.Utilities;

import java.io.FileNotFoundException;
import java.util.Hashtable;

public class LoginTest extends BaseTest {

    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void loginTest(Hashtable<String, String> data) {
        HomePage home = new HomePage();
        LoginPage login = home.goToLogin();
        ZooAppPage zp = login.doLogin(data.get("username"), data.get("password"));
        zp.goToCalendar();
    }
}
