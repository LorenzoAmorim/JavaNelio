package INTERFACES.Interfaces.src.model.services;

import INTERFACES.Interfaces.src.model.entities.CarRental;
import INTERFACES.Interfaces.src.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxServices;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxServices) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxServices = taxServices;
    }

    /* Cálculos:
    Duração = (25/06/2018 14:40) - (25/06/2018 10:30) = 4:10 = 5 horas
    Pagamento básico = 5 * 10 = 50
    Imposto = 50 * 20% = 50 * 0.2 = 10 */
    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60;

        double basicPayment;
        if(hours<=12.0)
            basicPayment = pricePerHour * Math.ceil(hours);
        else
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);

        double tax = taxServices.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
