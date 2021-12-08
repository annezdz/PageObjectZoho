package pages.crm;

import base.Page;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CalendarPage extends Page {

    public void createCalendar(String titulo, String calendar){
       // click("tenteMaisTarde_XPATH");
        click("cell_XPATH");
        type("titulo_XPATH", titulo);
        select("selectCalendar_XPATH",calendar);
        click("btnCriar_XPATH");
    }
}
