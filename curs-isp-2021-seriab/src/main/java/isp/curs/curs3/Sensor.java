/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs3;

import java.util.Objects;


public class Sensor {
    private int value;
    private String location;

    public Sensor(int value, String location) {
        this.value = value;
        this.location = location;
    }
    
    public void metodaA(){
        System.out.println("Metoda A"); 
    }

    @Override
    public String toString() {
        return "Sensor "+value+" "+location;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sensor other = (Sensor) obj;
        if (this.value != other.value) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }
    
    
    
    
    public static void main(String[] args) {
        Sensor s1 = new Sensor(10, "Plant A");
        Sensor s2 = new Sensor(10, "Plant A");
        
        System.out.println(s1);
        
        if(s1.equals(s2)){
            System.out.println("Obiecte egale.");
        }
        
        
        System.out.println(".....");
        TemperatureSensor t1 = new TemperatureSensor(1, "PlantA", "F");
        t1.metodaA();
        
        Sensor t2 = new TemperatureSensor(2, "PlantB", "C");
        t2.metodaA(); //JVM la runtime (in timpul executie) descopera in mod dinamic tipul concret al obiectului si apeleaza metoda din obiectul conreet;
        
        Object t3 = new TemperatureSensor(3, "PlantC", "F");
        //t3.metodaA();  - eroare de compilare deoarece printr-o referinta de tip Object nu pot accesa metode din clasa conreta
        
        //conversie de tip
        ((TemperatureSensor)t3).metodaA();
        ((Sensor)t3).metodaA();
        
        if(t3 instanceof Person)
            ((Person)t3).metodaA(); //eroare la runtime 
        else
            System.out.println("Tip incorect.");
        
        
    }
}
