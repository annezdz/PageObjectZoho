package base;

import accounts.AccountsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {

    WebDriver driver;

    public TopMenu(WebDriver driver){
        this.driver = driver;
    }

    public void goToHome(){

    }

    public void goToFeeds(){

    }

    public void goToLeads(){

    }

    public AccountsPage goToAccounts(){
        driver.findElement(By.xpath("//a[normalize-space()='Contas']")).click();
        return new AccountsPage();
    }

    public void goToContacts(){

    }

    public void signOut(){

    }

}
