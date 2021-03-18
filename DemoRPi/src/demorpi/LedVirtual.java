/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demorpi;


public class LedVirtual implements ILed{

    private boolean state;
    
    @Override
    public void turnOn() {
        state = true;
        System.out.println("Led is tuned ON");
    }

    @Override
    public void turnOff() {
        state = false;
        System.out.println("Led is turned OFF");
    }
    
    public boolean getState(){
        return state;
    }
    
}
