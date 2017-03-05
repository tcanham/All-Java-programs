/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotellisa;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class BusGroup extends Reservation {
    
private  boolean valet;
private boolean guide;
private static final double costvalet = 100;  
private static final double costguide = 150;
double totalBill=0;



    public BusGroup(boolean valeting, boolean tourguide, int days, int partyNum, String Cat, boolean sup) {
        super(days, partyNum, Cat, sup);
        this.valet = valeting;
        this.guide = tourguide;
        resNum=counter++;
        
    }
 //-------------------------Methods------------------------------------------
    
//--Generate IBAN-----------------------------------
    
  public long IbanGen(int sortIn,int accIn,String x)
 {
 double billAmount;
 billAmount= totalBill;
 long ibanNum=0;
 String strSort = sortIn+"";
 String strAcc = accIn+"";
 String firstPart ;
 String lastPart;
 String join;
 
 if (billAmount>threshold)
 {
     firstPart = strSort.substring(0,2);
     lastPart = strSort.substring(2,6);
     join = firstPart+strAcc+lastPart;  
     ibanNum = Long.parseLong(join);
 }
 return ibanNum ;    
 } ; 

//--Generate bill method----------------------------------   
@Override
   public double DailyBill()
   {
double addSupper;       
double costPerNight;
double subTotal;

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

 String strCodeIn = JOptionPane.showInputDialog(null,"Input sort code");
 int codeIn =Integer.parseInt(strCodeIn);
 String strAccIn = JOptionPane.showInputDialog(null,"Input account number");
 int accIn =Integer.parseInt(strAccIn);
 long ibanGen = IbanGen(codeIn,accIn,"bus"); //generate iban if necc.
 System.out.println("Your iban number is: "+ibanGen);  
 
 return totalBill;
}

//--------------------------To string------------------------
    @Override
    public String toString() {
        System.out.println("Group details:\n"+ super.toString());
        return "Extras: {" + "valeting=" + valet + ", tourguide=" + guide + '}';
    }

}//end of class
