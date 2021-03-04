package isp.curs.curs2;


public class Main2 {
    public static void main(String[] args) {
        
        Robot2.count = 10;
        Robot2.incrementCount();
        //Robot2.moveRight(); //incorect doearece moveRgith este metoda de instanta
        
        Robot2 r1 = new Robot2(10, "ABC");
        
        System.out.println(r1);
        //r1.displayDetails();
        //System.out.println(r1.x+" "+r1.location);  eroare deoarece atributele sunt private 
       
        r1.moveRight();
        r1.moveRight();
        
        Robot2 r2 = new Robot2("XYZ");
        System.out.println("...........");
        System.out.println(r2);
        System.out.println(r1);
        
        //metoda gresita de a copara obiecte
        if(r1 == r2){
            System.out.println("Obiecte egale");
        }else{
            System.out.println("Obiecte diferite");
        }
        
        if(r1.equals(r2)){
            System.out.println("Obiecte egale");
        }else{
            System.out.println("Obiecte diferite");
        }
        
        r1.moveRight();
        System.out.println(r2);
        
        //r2.displayDetails();
    }
}
