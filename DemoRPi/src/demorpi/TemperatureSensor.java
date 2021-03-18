/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demorpi;

import java.util.Random;


public class TemperatureSensor {
    private double value;

    public double getValue() {
        Random x = new Random();
        value = x.nextInt(60);
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    
}
