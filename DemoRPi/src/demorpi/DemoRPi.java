/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demorpi;

import java.util.concurrent.TimeUnit;


public class DemoRPi {

    public static void main(String[] args) throws InterruptedException {
        
        ILed led1 = new LedVirtual();
        ILed led2 = new LedRPi();
        TemperatureSensor s = new TemperatureSensor();
        
        Controller ctrl = new Controller(led2, s);
        
        for(int i=0;i<15;i++){
            ctrl.control();
            TimeUnit.SECONDS.sleep(3);
        }
        
    }
    
}
