/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs6.observer;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Se utilizeaza atunci cand dorim sa noitificam o entitate cu privire la schimabrea de stare
 * a unei alte entitati. 
 */


class Observable{
    private ArrayList<Observer> entities = new ArrayList<>();
    
    public void addObserver(Observer e){
        entities.add(e);
    }
    
    public void changeState(String event){
        for(Observer o: entities)
            o.update(event);
    }
}

@FunctionalInterface //interfata care contine o singura methoda
interface Observer{
    void update(String event);
}

class FireAlarm extends Observable{
    void fireHasStarted(){
        System.out.println("Simulate fire!");
        changeState("Fire Started!");
    }
}

class SMSGateway implements Observer{

    @Override
    public void update(String event) {
        System.out.println("Sending SMS for event:"+event);
    }

}

class Telegram implements Observer{

    @Override
    public void update(String event) {
        System.out.println("Sending Telegram message for event "+event);
    }
    
}


public class ExampleUse {
    public static void main(String[] args) throws InterruptedException  {
        FireAlarm alarm = new FireAlarm();
        
        Telegram t = new Telegram();
        SMSGateway g = new SMSGateway();
        
        alarm.addObserver(g);
        alarm.addObserver(t);
        
        alarm.addObserver(new Observer(){
            @Override
            public void update(String event) {
                 System.out.println("ANother observer has received event.");
            }
            
        });
        
        //lambda expression
        alarm.addObserver((e)->System.out.println("Alarm has been triggered for event "+e));
    
        for(int i=0;i<4;i++){
            alarm.fireHasStarted();
            
            //preceeding steps
          //  try {
                //block try
                //1.
                TimeUnit.SECONDS.sleep(1);
                //2.
                //3.
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ExampleUse.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
            //nest step
        }
    
    }
}
