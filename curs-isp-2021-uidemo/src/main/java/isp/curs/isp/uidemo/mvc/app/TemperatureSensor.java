/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.isp.uidemo.mvc.app;

import isp.curs.isp.uidemo.mvc.AbstractModel;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mihai.hulea
 */
public class TemperatureSensor extends AbstractModel implements Runnable {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        int old = this.value;
        this.value = value;
      
        this.firePropertyChange("value", old, value);
    }
    
    public void run(){
        Random r = new Random();
        while(true){
            
            setValue(r.nextInt(100));
            
            System.out.println("new value "+value);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(TemperatureSensor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
