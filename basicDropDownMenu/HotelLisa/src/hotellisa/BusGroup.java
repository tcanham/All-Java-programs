/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotellisa;

/**
 *
 * @author user
 */
public class BusGroup extends Reservation {
    
private  boolean valet;
private boolean guide;
private static final double costvalet = 100;  
private static final double costguide = 150;

    public BusGroup(boolean valeting, boolean tourguide, int days, int partyNum, String Cat, boolean sup) {
        super(days, partyNum, Cat, sup);
        this.valet = valeting;
        this.guide = tourguide;
        resNum=counter++;
        
    }

     
@Override
   public double DailyBill()
   {
double addSupper;       
double costPerNight;
double subTotal;
double totalBill=0;
double partySize = super.getPartyNum();
//--------Calculate nightly cost-------------------------------

costPerNight= partySize*Reservation.getMidWeek( );
addSupper=partySize*supper;
subTotal= costPerNight+addSupper;
System.out.println("Cost per night: "+subTotal);

//----------------Calculate total cost------------------------

 totalBill= subTotal*super.getDays(); 
 
if(valet){totalBill=totalBill+100;}
if(guide){totalBill=totalBill+150;}
   
 return totalBill;
}

//--------------------------To string------------------------
    @Override
    public String toString() {
        System.out.println("Group details:\n"+ super.toString());
        return "Extras: {" + "valeting=" + valet + ", tourguide=" + guide + '}';
    }

}//end of class
