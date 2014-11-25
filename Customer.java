package GPP_projekt;
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    PhoneNumber phoneNumber;
    Name name;
    public Customer(String name, int phoneNumber){
        this.name = new Name(name);
        this.phoneNumber = new PhoneNumber(phoneNumber);
    }
    
    public String getName(){
        return name.getName();
    }
    
    public int getPhoneNumber(){
        return phoneNumber.getPhoneNumber();
    }
    
}
