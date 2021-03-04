
package isp.curs.curs2;


public class Main {
    
    public static void main(String[] args) {
        Robot r1 = new Robot(); //operatie de instantiere a unui obiect
        Robot r2; //declarare variabila de tip referinta 
        r2 = new Robot(); //instantiere de obiect 
        Robot r3=null;
        //.....
        
        r1.x = 10;
        r2.x = 20;
        //r3.x = 90;
        
        System.out.println("R1="+r1);
        System.out.println("R2="+r2);
        
        r1 = r2;
        System.out.println("..........");    
        System.out.println("R1="+r1);
        System.out.println("R2="+r2);
        
        r1.x = 30;
        System.out.println("r2.x=" +r2.x);
        
        
        //String este uncaz special, deoarece obiectele pot fi create si cu operatorul '='        
        String s = "Acesta este un mesaj";
        String s2 = new String("Acesta este alt mesaj");
        
    }
    
}
