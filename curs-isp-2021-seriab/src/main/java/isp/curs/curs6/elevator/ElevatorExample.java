/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs6.elevator;

import java.util.LinkedList;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import lombok.Getter;
import lombok.Setter;

class Elevator extends Observable{
    
    @Getter
    private int floor;
    
    public void move(int target){
        System.out.println("Move eleavtor to floor "+target);
        floor = target;
        changeState("Move elevator to floor "+target);
    }
    
}

class Door{
    void open(){
        System.out.println("Open door");
    }
    
    void close(){
        System.out.println("Close door");
    }
}

class Command{
    
    @Getter
    private int targetFloor;

    public Command(int targetFloor) {
        this.targetFloor = targetFloor;
    }
    
}

class ElevatorController{
    
    private Elevator e;
    private Door d;
    private LinkedList<Command> queue = new LinkedList<>();

    public ElevatorController(Elevator e, Door d) {
        this.e = e;
        this.d = d;
    }
    
    public void sendCommand(Command c){
        queue.addLast(c);
    }
    
    public void control() throws InterruptedException{
        Command c = null;
        
        
        //if(queue.size()>0)
        //    c = queue.removeFirst();
        
        // Optional - se utilizeaza pentru a evita utilizarea lui null
        Optional<Command> c2 = queue.stream().findFirst(); //using stream to get first element. 
        
        //if(c!=null){
        if(c2.isPresent()){
            c = c2.get(); //get value from Optional
            queue.remove(c); //remove command from queue so that next time we do not execute it again!
            if(c.getTargetFloor()> e.getFloor()){
                System.out.println("Move elevator UP!");
                e.move(c.getTargetFloor());
                d.open();
            }else if (c.getTargetFloor()< e.getFloor()){
                System.out.println("Move elevator DOWN!");
                e.move(c.getTargetFloor());
            }else{
                System.out.println("Elevator already at requested floor!");
            }
            d.open();
            TimeUnit.SECONDS.sleep(1);
            d.close();

        }
    }
    
}



/**
 *
 * @author mihai.hulea
 */
public class ElevatorExample {
    public static void main(String[] args) throws InterruptedException {
        Command c = new Command(4);
        
        Elevator e = new Elevator();
        Door d = new Door();
        ElevatorController ec = new ElevatorController(e, d);
        ButtonsPanel panel = new ButtonsPanel();
        panel.setVisible(true);
        
        e.addObserver(panel);
        
        ec.sendCommand(new Command(3));
        
        ec.sendCommand(new Command(1));
        ec.sendCommand(new Command(0));
        ec.sendCommand(new Command(4));
        
        for(int i=0;i<10;i++)
            ec.control();
    }
}
