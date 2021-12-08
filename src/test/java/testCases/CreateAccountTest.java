package testCases;

import base.Page;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZooAppPage;
import pages.crm.AccountsPage;
import pages.crm.CreateAccountPage;
import utilities.Utilities;

import java.util.Hashtable;

public class CreateAccountTest {

    @Test(enabled = false, dataProviderClass = Utilities.class, dataProvider = "dp")
    public void createAccountTest(Hashtable<String, String> data){
        ZooAppPage zp = new ZooAppPage();
        zp.goToCalendar();
        AccountsPage accountsPage = Page.menu.goToAccounts();
        CreateAccountPage create = accountsPage.goToCreateAccounts();
        create.createAccountPage(data.get("accountName"));
        //Assert.fail("Go Go GO");


    }
}
