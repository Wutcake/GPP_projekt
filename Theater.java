package GPP_projekt;

import java.util.ArrayList;

/**
 * Write a description of class Theater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Theater
{
    private int theaterNumber;
    ArrayList<SeatRow> seatRows;
    public Theater(ArrayList<SeatRow> seatRows, int theaterNumber){
        this.seatRows = seatRows;
        this.theaterNumber = theaterNumber;
    }
    
    public int getSeatNumber(int row, int column){
        return seatRows.get(row).getSeatNumber(column);
    }
    
    public int getReservationID(int row, int column){
        return seatRows.get(row).getSeatReservationID(column);
    }
    
    public int getTheaterNumber(){
        return theaterNumber;
    }
    
    public int getRowAmount(){
        return seatRows.size();
    }
    
    public int getRowLength(){
        return seatRows.get(0).getLength();
    }
    

}
