package hotel.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Customers extends User {
    private BigDecimal payment_Amount;


    @Override
    public String toString() {
        return "Customers{" +
                "payment_Amount=" + payment_Amount +
                ", timeOfArrival=" + timeOfArrival +
                ", timeOfDeparture=" + timeOfDeparture +
                ", dateOfArrival=" + dateOfArrival +
                ", dateOfDeparture=" + dateOfDeparture +
                ", room=" + room +
                ", payment=" + payment +
                ", lodgers=" + lodgers +
                '}';
    }

    private LocalTime timeOfArrival;
    private LocalTime timeOfDeparture;

    private LocalDate dateOfArrival;

    private LocalDate dateOfDeparture;

    private Rooms room;
    private boolean payment;

    public Customers(BigDecimal payment_Amount, LocalTime timeOfArrival, LocalTime timeOfDeparture, LocalDate dateOfArrival, LocalDate dateOfDeparture, Rooms room, boolean payment, int lodgers) {
        this.payment_Amount = payment_Amount;
        this.timeOfArrival = timeOfArrival;
        this.timeOfDeparture = timeOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;
        this.room = room;
        this.payment = payment;
        this.lodgers = lodgers;
    }

    private int lodgers;

    public BigDecimal getPayment_Amount() {
        return payment_Amount;
    }

    public void setPayment_Amount(BigDecimal payment_Amount) {
        this.payment_Amount = payment_Amount;
    }

    public LocalTime getTimeOfArrival() {
        return timeOfArrival;
    }

    public  LocalTime setTimeOfArrival(LocalTime timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
        return null;
    }

    public LocalTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public LocalTime setTimeOfDeparture(LocalTime timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
        return LocalTime.now();
    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(LocalDate dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public LocalDate getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(LocalDate dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public Rooms getRoom() {
        return room;
    }

    public void setRoomNo(Rooms room) {
        this.room = room;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    public int getLodgers() {
        return lodgers;
    }

    public void setLodgers(int lodgers) {
        this.lodgers = lodgers;
    }
}
