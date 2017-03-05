/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotellisa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Reservation extends HotelLisa implements IBAN {
    
  ArrayList <Double> addDay = new ArrayList(0);
  double sum = 0;   
    
//----------------------- Set variables----------------------
  
public static final int midWeek = 45;    
public static final int weekEnd = 65;    
public static final int Wedding = 55;
public static final int supper = 8;
public static int counter=1;    
public int resNum;    
private String name;    
private String arrive;
private  int days;
private  int partyNum; 
private String Cat;
private double bill;
public static double totalsales;
private boolean sup;

//--------------------Constructors----------------------------

    public Reservation(int days, int partyNum) {
        this.days = days;
        this.partyNum = partyNum;
        this.resNum = counter;
        counter++;   
    }

    public Reservation(int days, int partyNum, String Cat) {
        this.days = days;
        this.partyNum = partyNum;
        this.Cat = Cat;
        this.resNum = counter;
        counter++;   
    }

    public Reservation(int days, int partyNum, String Cat, boolean sup) {
        this.days = days;
        this.partyNum = partyNum;
        this.Cat = Cat;
        this.sup = sup;   
    }

  //-----------------------Get & Set-----------------------------
    
public int getPartyNum() {
      return partyNum;
  }

public void setPartyNum(int partyNum) {
     this.partyNum = partyNum;
 } 
    
public static int getMidWeek( ){
    return midWeek;
}

 public static int getCounter( ){
    return counter;
}

 public int getResNum() {
        return resNum;
    }

 public void setResNum(int resNum) {
        this.resNum = resNum;
    }

 public String getName() {
        return name;
    }

 public void setName(String name) {
        this.name = name;
    }

 public String getArrive() {
        return arrive;
    }

public void setArrive(String arrive) {
        this.arrive = arrive;
    }

public String getCat() {
        return Cat;
    }

public void setCat(String Cat) {
        this.Cat = Cat;
    }

public boolean isSup() {
        return sup;
    }

public void setSup(boolean sup) {
        this.sup = sup;
    }

public int getDays() {
        return days;
    }

public void setDays(int days) {
        this.days = days;
    }

public static int getWeekEnd() {
        return weekEnd;
    }

public static int getWedding() {
        return Wedding;
    }

public static int getSupper() {
        return supper;
    }
    

//----------------To string------------------------
   
    @Override
  public String toString( )
{
    
 return "Reservation{" + "resNum=" + resNum + ", name=" + name + ", arrive=" + arrive + ", days=" + days + ", partyNum=" + partyNum + ", Cat=" + Cat + ", sup=" + sup + '}';
}    
       
//--------------------------------Methods------------------------   

  
//--Iban generator----------------------------- 
  
  @Override
  public long IbanGen(int sortIn,int accIn)
 {
 
double billAmount;
billAmount= sum;
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

//--Daily bill generator------------------------  
 
  public double DailyBill()  
{
//----------------Set variables-------------------------------
double costPerNight=0;
double totalBill=0;
double partySize = this.partyNum;
//-----------------Calculate cost for each night---------------

if(this.Cat==null)
        {
 String ans = JOptionPane.showInputDialog(null,"Input Catagory");
  this.Cat = ans;
        }
 switch (this.Cat) {
        case "MW":
            costPerNight = partySize*midWeek;
            break;
        case "WE":
            costPerNight = partySize*weekEnd;
            break;
        case "WP":
            costPerNight = partySize*Wedding;
            break;   
     }
    System.out.println("Cost one night: "+costPerNight);
    totalBill=costPerNight*this.days;
     
 return costPerNight;
 
}//end of daily method
  
//--Total bill generator-------------------------  
  
public double TotalBill()    
{
//----------------set variables-----------------------------------
    
   int stayLength=getDays(); 
   double Day;
   double totalSupper=8*this.partyNum;
   
//----------------------For each day--------------------------------
   
  for (int i=1;i<stayLength+1;i++)
    { 
 //-----------------------Add suppers-------------------------------------
     Day = DailyBill();
     addDay.add(Day);   
     String ans = JOptionPane.showInputDialog(null,"Supper on night: "+i);
     if(ans.equals("yes"))
     {
      sup = true;
      if(sup == true)
      {
       sum= sum + totalSupper;   
      }
     } 
    }    
 //----------------Calculate total bill-------------------------------
  
    for(int i = 0; i < addDay.size(); i++)
    {
     sum += addDay.get(i);
    }
 //---------------------------------------------------------------------   
    
 System.out.println("your total bill is: "+sum);
 
//-----------------Generate iban number----------------------------------
 
 String strCodeIn = JOptionPane.showInputDialog(null,"Input sort code");
 int codeIn =Integer.parseInt(strCodeIn);
 String strAccIn = JOptionPane.showInputDialog(null,"Input account number");
 int accIn =Integer.parseInt(strAccIn);
 long ibanGen = IbanGen(codeIn,accIn); //generate iban if necc.
 System.out.println("Your iban number is: "+ibanGen);
 
 //-------------return-----------------------------
 return sum; 
 
}// end of totalBill

}//end of class
