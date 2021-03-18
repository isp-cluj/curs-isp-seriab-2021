/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demorpi;

/**
 *
 * @author mihai.hulea
 */
public class Controller {
    private ILed led;
    private TemperatureSensor sensor;

    public Controller(ILed led, TemperatureSensor sensor) {
        this.led = led;
        this.sensor = sensor;
    }
    
    public void control(){
        System.out.println("...");
        if(sensor.getValue()>30){
            System.out.println("Temperature = "+sensor.getValue());
            led.turnOn();
        }
        else{
            System.out.println("Temperature = "+sensor.getValue());
            led.turnOff();
        }
    }
}
