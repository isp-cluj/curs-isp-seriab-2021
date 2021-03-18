/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demorpi;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

/**
 *
 * @author mihai.hulea
 */
public class LedRPi implements ILed {

    final GpioController gpio = GpioFactory.getInstance();
    final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);

    public LedRPi() {
        pin.setShutdownOptions(true, PinState.LOW);
        pin.low();
    }
    
    @Override
    public void turnOn() {
        pin.low();
    }

    @Override
    public void turnOff() {
        pin.high();
    }
    
}
