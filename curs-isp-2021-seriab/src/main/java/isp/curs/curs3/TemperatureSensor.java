/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs3;

/**
 *
 * @author mihai.hulea
 */
public class TemperatureSensor extends Sensor {
    
    private String measure;
    
    public TemperatureSensor(int value, String location, String measure) {
        super(value, location); //trebuie sa fie prima instructiune
        this.measure = measure;
    }
    
    void metodaB(){
        System.out.println("Metoda B");
        super.metodaA(); 
    }
    
    public void metodaA(){
        System.out.println("Metoda A din clasa TemperatureSensot");
    }
    
}
