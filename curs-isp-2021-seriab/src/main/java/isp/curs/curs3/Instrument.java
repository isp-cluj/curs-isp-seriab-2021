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
public abstract class Instrument {
    
    private String name;

    public Instrument(String name) {
        this.name = name;
    }
    
    abstract void play(String nota);
    
    public void display(){
        System.out.println("Instrument name "+ name);
    }
    
    
    public static void main(String[] args) {
        Instrument i = new Pian("Pian");
        i.display();
    }
}


class Pian extends Instrument{

    public Pian(String name) {
        super(name);
    }

    @Override
    public void play(String nota) {
        System.out.println("Pianul canta. Nota:"+nota);
    }
    
}
