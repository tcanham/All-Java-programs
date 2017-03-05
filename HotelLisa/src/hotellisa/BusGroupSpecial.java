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
public abstract class BusGroupSpecial extends BusGroup {

    public BusGroupSpecial(boolean valeting, boolean tourguide, int days, int partyNum, String Cat, boolean sup) {
        super(valeting, tourguide, days, partyNum, Cat, sup);
    }
  abstract void timeNow(); 
    
    
}
