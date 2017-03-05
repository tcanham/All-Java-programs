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
public class Reservation extends HotelLisa {
    
  ArrayList <Double> addDay = new ArrayList(0);
  double sum = 0;   
    
//-----------------------    
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
    
     public static int getMidWeek( )
{
    
 return midWeek;
}

   
     public static int getCounter( )
{
    
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
    
    
    
//--------------------------------Methods-------------------------------------------------    
   
  public double DailyBill()  //--method to get nightly cost--
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
  
  
public double TotalBill()    //--method for total bill amount--
{
//----------------set variables-----------------------------------
    
   int stayLength=getDays(); 
   double Day;
   double totalSupper=8*this.partyNum;
   
//----------------------For each day--------------------------------
   
  for (int i=1;i<stayLength+1;i++)
    { 
 //-----------------------Add suppers-------------------------------------
        
     String ans = JOptionPane.showInputDialog(null,"Supper on night: "+i);
     if(ans.equals("yes"))
     {
      sup = true;
      if(sup == true)
      {
       sum= sum + totalSupper;   
      }
     }
     Day = DailyBill();
     addDay.add(Day);
    }    
 //----------------Calculate total bill-------------------------------
  
    for(int i = 0; i < addDay.size(); i++)
    {
     sum += addDay.get(i);
    }
 //---------------------------------------------------------------------   
    
     System.out.println("your total bill is: "+sum);   
 return sum; 
 
}// end of totalBill

}//end of class
