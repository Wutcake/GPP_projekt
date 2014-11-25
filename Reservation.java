package GPP_projekt;
/**
 * Write a description of class Reservation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reservation
{
    Show show;
    Customer customer;
    ReservedSeats sæder;
    public Reservation(Show show, ReservedSeats seats, String name, int phoneNumber){
        this.show = show;
        this.customer = new Customer(name, phoneNumber);
    }
}
