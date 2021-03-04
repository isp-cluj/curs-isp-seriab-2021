
package isp.curs.curs2;

//gettere si settere - utilizate pentru citirea respectiv modificarea valorilor unor atribute

public class Robot3 {
    private int x; 
    private int y;

    public Robot3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    

    @Override
    public String toString() {
        return "Robot3{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
    
}
