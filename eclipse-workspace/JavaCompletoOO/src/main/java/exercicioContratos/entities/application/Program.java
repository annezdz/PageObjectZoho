package exercicioContratos.entities.application;

import exercicioContratos.entities.Contract;
import exercicioContratos.entities.Installment;
import exercicioContratos.entities.service.ContractService;
import exercicioContratos.entities.service.OnlinePaymentService;
import exercicioContratos.entities.service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter contract data: ");
        System.out.print("Number : ");
        int number = scanner.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");

        Date date = sdf.parse(scanner.next());


        System.out.print("Contract value: ");
        double value = scanner.nextDouble();

        Contract contract = new Contract(number,date,value);

        System.out.print("Number of intallments: ");
        int months = scanner.nextInt();


        ContractService cs = new ContractService(new PaypalService());
        cs.processContract(contract,months);
        System.out.println("Installments: ");
        for(Installment installment : contract.getInstallments()) {
            System.out.print(installment);
        }

        scanner.close();

        }
    }

