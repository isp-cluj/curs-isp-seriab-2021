/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs12.reflexia;

/**
 *
 * @author mihai.hulea
 */
public class Test {
    public static void main(String[] args) {
        
        //immutable class
        String s1 = "ABC";
        String s2 = "ABC";
        
        if(s1.equals(args)){
            System.out.println("EGAL");
        }else{
            System.out.println("DIFERIT");
        }
        
        
        if(s1==s2){
            System.out.println("EGAL");
        }else{
            System.out.println("DIFERIT");
        }
    }
}
