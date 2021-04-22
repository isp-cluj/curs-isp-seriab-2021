/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.multithread.programming.basic;

/**
 *
 * @author mihai.hulea
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TemperatureSensorT t1 = new TemperatureSensorT("ST1");
        TemperatureSensorT t2 = new TemperatureSensorT("ST2");
        TemperatureSensorT t3 = new TemperatureSensorT("ST3");
        t1.start();
        t2.start();
        t3.start();
        /////////////////
        
        Thread r1 = new Thread(new TemperatureSensorR("SR1"));
        //r1.setDaemon(true);
        Thread r2 = new Thread(new TemperatureSensorR("SR1"));
        //r2.setDaemon(true);
        Thread r3 = new Thread(new TemperatureSensorR("SR1"));
        //r3.setDaemon(true);
        
        r1.start();
        r2.start();
        r3.start();
        
        Thread.sleep(5000);
        
        
        // threaduri care NU sunt daemon 
        //daemon thread 
    }
}
