package EXCEÇÕES_PERSONALIZADAS.entities;

import java.util.Date;

public class Reservation {
    public Integer roomNumber;
    public Date checkin;
    public Date checkout;

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }
}
