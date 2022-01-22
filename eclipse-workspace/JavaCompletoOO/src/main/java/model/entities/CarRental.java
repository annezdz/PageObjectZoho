package model.entities;

import java.util.Date;
import java.util.List;

public class CarRental {

    private Date start;
    private Date finish;

    private Vehicle vehicle;

    private Invoice invoice;

    public CarRental() {}

    public CarRental(Date start, Date finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoices) {
        this.invoice = invoices;
    }
}
