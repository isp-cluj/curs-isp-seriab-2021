package isp.curs.curs2;

import java.util.Objects;

class Robot2 {
    //incapsulare 
    static int count; 
    private int x;
    private String location;
    
    Robot2(int x, String location){
        count++;
        this.x = x;
        this.location = location;
        System.out.println("Contructor 1");
    }

    Robot2(String location) {
        this(1, location); //prima instructiune in constructor
        this.location = location;
        System.out.println("Contructor 2");
        //this.x = 1;
    }
    
    static void incrementCount(){
        count++;
    }
    
    void moveLeft(){  
        if(this.x>0)
            this.x--;
    }
    
    void moveRight(){
        this.x++;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        Robot2 other = (Robot2)obj;
        return other.x==this.x && other.location.equals(this.location);        
    }   
    
    @Override
    public String toString() {
        return "Robot2{" + "x=" + x + ", location=" + location + '}';
    }
  
}
