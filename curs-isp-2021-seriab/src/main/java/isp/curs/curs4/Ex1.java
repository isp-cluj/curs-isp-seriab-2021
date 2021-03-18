/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs4;


class Sensor{
    private static Sensor instance;
    private int value;
    private Sensor(int value){
        this.value = value;
    }
    
    public static Sensor createSensor(int x){
        if(instance==null)
            instance = new Sensor(x);
        return instance;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        //Sensor s = new Sensor(10);
        Sensor s = Sensor.createSensor(10);
    }
}
