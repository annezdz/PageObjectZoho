package testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.crm.CalendarPage;
import utilities.Utilities;

import java.util.Hashtable;

import static base.Page.driver;

public class CalendarTest {

    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void calendarTest(Hashtable<String, String> data){
        CalendarPage calendarPage = new CalendarPage();
        calendarPage.createCalendar(data.get("title"), data.get("calendar"));
        WebDriverWait wait = new WebDriverWait(driver,10);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(alert.getText(),"Evento adicionado");
    }
}
