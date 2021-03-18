/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs3.interfata;

class Pian implements Instrument{

    private String name;
    
    public Pian(String name) {
        this.name = name;
    }

    public void play(String nota) {
        System.out.println("Pianul canta. Nota:"+nota);
    }
    
     public void display(){
        System.out.println("Instrument name "+ name);
    }
    
    public static void main(String[] args) {
        Instrument i = new Pian("Pian");
        //i.display();
        i.play("DO");
        
        ((Pian)i).display();
    }
}

