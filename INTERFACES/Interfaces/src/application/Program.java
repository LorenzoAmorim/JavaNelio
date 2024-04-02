package INTERFACES.Interfaces.src.application;

import INTERFACES.Interfaces.src.model.entities.CarRental;
import INTERFACES.Interfaces.src.model.entities.Vehicle;
import INTERFACES.Interfaces.src.model.services.BrazilTaxServices;
import INTERFACES.Interfaces.src.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String CarModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(CarModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrazilTaxServices());
        rs.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: R$" + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: R$" + cr.getInvoice().getTax());
        System.out.println("Pagamento total: R$" + cr.getInvoice().getTotalPayment());



        sc.close();
    }
}
