/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs12.reflexia;

/**
 *
 * @author mihai.hulea
 */
public class Car {
    
    private String name;
    private int maxSpeed = 100;
    private int currentSpeed;

    public Car(){
        name = "NoName";
    }
    
    public Car(String name, int currentSpeed) {
        this.name = name;
        this.currentSpeed = currentSpeed;
    }
   
    
    void accelerate(){
        if(currentSpeed<= maxSpeed)
            currentSpeed++;
        
        System.out.println("Current speed="+currentSpeed);
    }
    
    private void setSpeedLimit(Integer k){
        maxSpeed = k;
        System.out.println("NEW SPEED LIMIT="+maxSpeed);
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", maxSpeed=" + maxSpeed + ", currentSpeed=" + currentSpeed + '}';
    }
    
        
}
