/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs4;

@FunctionalInterface
interface Instrument{
    public void play();
}


abstract class Pian implements Instrument{
    private String type;
 
    public Pian(String type) {
        this.type = type;
    }
    
//    @Override
//    public void play() {
//        
//    }

}

class Pianina extends Pian{
   
    public Pianina(String type) {
        super(type);
    }

    @Override
    public void play() {
        System.out.println("Pianina canta");
    }
    
}

class Muzician{
    
    void cantaPartitura(Instrument i){
        i.play();
    }
}

public class Ex2 {
    public static void main(String[] args) {
        //Instrument i = new Instrument();
        
        Instrument i2 = new Instrument(){
            public void play(){
                System.out.println("PLAY");
            }
        };
        
        Muzician m = new Muzician();
        
        m.cantaPartitura(new Instrument(){
            @Override
            public void play() {
                System.out.println("Canta la un pian!");
            }
            
        });
        
        //lambda expression
        m.cantaPartitura(()->System.out.println("Canta la pian"));
        
    }
}
