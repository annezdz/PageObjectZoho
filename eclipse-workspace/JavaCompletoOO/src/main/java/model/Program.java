package model;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.BrasilTaxService;
import model.service.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        System.out.println("Enter rental data:");
        System.out.print("Car model: ");
        String carModel = scanner.nextLine();
        try {
            System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
            Date start =  sdf.parse(scanner.nextLine());
            System.out.print("Return (dd/MM/yyyy hh:ss): ");
            Date finish =  sdf.parse(scanner.nextLine());
            CarRental carRental = new CarRental(start,finish,new Vehicle(carModel));
            System.out.print("Enter price per hour: ");
            double pricePerHour = scanner.nextDouble();
            System.out.print("Enter price per day: ");
            double pricePerDay = scanner.nextDouble();
            RentalService rentalService = new RentalService(pricePerDay,pricePerHour,new BrasilTaxService());
            rentalService.processInvoice(carRental);
            System.out.println("INVOICE:");
            System.out.print("Basic payment: " + String.format("%.2f%n",carRental.getInvoice().getBasicPayment()));
            System.out.print("Tax: " + String.format("%.2f%n",carRental.getInvoice().getTax()));
            System.out.print("Total payment: " + String.format("%.2f%n",carRental.getInvoice().getTotalPayment()));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
