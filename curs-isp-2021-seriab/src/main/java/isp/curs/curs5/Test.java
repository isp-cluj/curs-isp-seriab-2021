/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author mihai.hulea
 */
public class Test {
    
    static int GetStocValue(Product[] list){
        int t = 0;
        for(Product p: list){
            if(p!=null)
                t+=(p.getPrice()*p.getQuantity());
        }
        return t;
    }
    
    static int GetStocValue(List<Product> list){
        int t = 0;
        for(Product p: list){
            t+=(p.getPrice()*p.getQuantity());
        }
        return t;
    }
    
    static void ViewStoc(Collection<Product> list){
        for(Product p: list){
            System.out.println(p);
        }
    }
    
    static void ViewStoc(Iterator<Product> i){
        while(i.hasNext()){
            Product p = i.next();
            System.out.println(p);
        }
    }
    
    public static void main(String[] args) {
        Product[] list = new Product[10]; 
        list[0] = new Product(1, "A", 10, 100);
        list[1] = new Product(2, "B", 15, 100);
        System.out.println("Total stoc value:"+GetStocValue(list));
        
        ArrayList<Product> list2 = new ArrayList<>();
        list2.add(new Product(1, "A", 10, 100));
        list2.add(new Product(2, "B", 15, 100));
        list2.add(new Product(3, "C", 12, 30));
        
        System.out.println("Stoc value:"+GetStocValue(list2));
        ViewStoc(list2);
        
        //HashSet ...obiectlee nu mai sunt sortate
        TreeSet<Product> list3 = new TreeSet<>();
        list3.add(new Product(1, "A", 10, 100));
        list3.add(new Product(2, "B", 15, 100));
        list3.add(new Product(3, "C", 12, 30));
        list3.add(new Product(3, "C", 10, 30));
        System.out.println("...");
        ViewStoc(list3);
        System.out.println("...");
        ViewStoc(list3.iterator());
        
        //TreeMap<Product,String> details = new TreeMap<Product,String>();
        HashMap<Product,String> details = new HashMap<Product,String>();
        details.put(new Product(1, "A", 10, 100), "Coca-Cola");
        details.put(new Product(2, "B", 10, 100), "Coca-Cola");
        details.put(new Product(3, "C", 10, 100), "Pepsi");
        details.put(new Product(3, "C", 10, 100), "Pepsi");
        
        System.out.println("*******************");
        Set<Product> k = details.keySet();
        for(Product p: k){
            System.out.println(p);
            System.out.println(details.get(p));
            System.out.println("...");
        }
        
        
        
    }
}
