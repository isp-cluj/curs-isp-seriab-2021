/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs12.reflexia;

/**
 * Immutable class
 * @author mihai.hulea
 */
public class Sensor {
    private int value;

    Sensor(int value) {
        this.value = value;
    }
    
    public Sensor(){
        this(10); //prima instructiune 
    }

    int getValue() { //default access //packafe access
        return value;
    }
    
    public static void main(String[] args) {
        Sensor s1 = new Sensor();
        
    }
        
}


