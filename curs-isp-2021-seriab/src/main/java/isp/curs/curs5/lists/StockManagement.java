/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs5.lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author mihai.hulea
 */
public class StockManagement {
    
    private ArrayList<Product> products = new ArrayList<>();    
    
    public void addProduct(Product p){
        products.add(p);
    }
    
    /////////// FIND PRODUCT BY ID
    
    /**
     * Search for a product using indexOf.
     * 
     * @param productId
     * @return 
     */
    public Product findProductById1(int productId){
        int index = products.indexOf(new Product(productId, "", 0, 0));
        if(index!=-1)
            return products.get(index);
        else
            return null;
    }

    /**
     * Return an Optional instead of Product object to not deal anymore with null checking in calling method.
     * 
     * @param productId
     * @return 
     */
    public Optional<Product> findProductById2(int productId){
        Product p = null;
        
        //this is working because we have equals method overwriten !!! otherway will fail
        int index = products.indexOf(new Product(productId, "", 0, 0));
        if(index!=-1)
            p = products.get(index);
        return Optional.ofNullable(p);        
    }
    
    /**
     * Using Optional and Streams to find and get first element from a list.
     * 
     * @param productId
     * @return 
     */
    public Optional<Product> findProductById3(int productId){
        return products.stream().filter(p -> p.getId()==productId).findFirst();
    }
    
    ////////// FIND ALL PRODUCTS WITH THE SAME PRICE
    
    /**
     * Find all products with a specific price using "classic method" (no Java 8 features).
     * 
     * @param price
     * @return 
     */
    public List<Product> findAllByPrice1(int price){
        ArrayList<Product> tmp = new ArrayList<>();
        for(Product p: products){
            if(p.getPrice()==price)
                tmp.add(p);
        }
        return tmp;
    }
    
    /**
     * Find product using Java 8 features.
     * 
     * @param price
     * @return 
     */
    public List<Product> findAllByPrice2(int price){
        return products.stream().filter(p -> p.getPrice() == price).collect(Collectors.toList());
    }
    
    
    ///// UPDATE A PRODUCT QUANTITY
    
    /**
     * Update quantity for a product with given id. 
     * 
     * @param id
     * @param newQuantity 
     */
    public void updateQuantity1(int id, int newQuantity){
        Product p = findProductById1(id);
        if(p!=null)
            p.setQuantity(newQuantity);
    }
    
    /**
     * Using streams and optionals to update product.
     * @param id
     * @param newQuantity 
     */
    public void updateQuantity2(int id, int newQuantity){
        Optional<Product> p = findProductById2(id);
        p.ifPresent(theProduct -> theProduct.setQuantity(newQuantity));
    }
    
   //////// REMOVE A PRODUCT BY ID
    
    public boolean removeProduct(int id){
       //this is working because euqlas method is present and use id for comparing.
       //this will remove the first element from the list
       return products.remove(new Product(id,"",0,0));
   }
       
   /////// COMPUTE TOTAL COST VALUE
   
    /**
     * Compute using for.
     * @return 
     */
   public int computeTotalStockValue1(){
       int sum = 0;
       for(Product p: products){
           sum+=(p.getPrice()*p.getQuantity());
       }
       
       return sum;
   }
   
   /**
    * Compute value using streams (Java 8).
    * 
    * @return 
    */
   public int computeTotalStockValue2(){
       int sum = products.stream().mapToInt(p -> p.getPrice()*p.getQuantity()).sum();
       
       //sau alternativa 
       // sum = products.stream().map(p -> (p.getPrice()*p.getQuantity())).reduce(sum, Integer::sum);

       return sum;
   }
   
   //////////// SORTING
   
   
   /**
    * Sorting objects using Comparator interface (as an alternative to Comparable). 
    * 
    * @param comp 
    */
   public void sort(Comparator<Product> comp){
       products.sort(comp);       
   }
   
   /////////// VIEW 
   
   /**
    * Show all elements in a list. 
    */
   public void showAll(){
       System.out.println("Show products:");
       for(Product p: products)
           System.out.println(p);
       
       
       // streams and lambda expression
       //products.stream().forEach(p -> System.out.println(p));
       
       //streams and method refference (::)
       //products.stream().forEach(System.out::println);
   }
    
   
    public static void main(String[] args) {
        StockManagement sm = new StockManagement();
        sm.addProduct(new Product(1, "A", 10, 100));
        sm.addProduct(new Product(2, "B", 20, 100));
        sm.addProduct(new Product(3, "C", 30, 80));
        sm.addProduct(new Product(4, "D", 30, 75));
        sm.addProduct(new Product(5, "E", 10, 90));
        
        // FIND A PRODUCT 
        Product p1 = sm.findProductById1(1);
        if(p1!=null)
            System.out.println("Product found:"+p1);
        else
            System.out.println("Product not found.");
        
        Optional<Product> p2 = sm.findProductById2(10);
        if(!p2.isEmpty())
            System.out.println("Product fodun:"+p2.get());
        else
            System.out.println("Product not found.");
        
        Optional<Product> p3 = sm.findProductById3(2);
        if(!p2.isEmpty())
            System.out.println("Product found:"+p2.get());
        else
            System.out.println("Product not found.");
        
        p3.ifPresentOrElse(theProduct -> System.out.println(theProduct), ()-> System.out.println("Product not found"));
    
        // UPDATE QUANTITY
        
        sm.updateQuantity1(2, 45);
        System.out.println("Product details:"+sm.findProductById1(2));
        System.out.println("Product details:"+sm.findProductById2(2).get());
        
        //REMOVE PRODUCT
        
        sm.removeProduct(3);
        
        // SORTING
        
        //method 1 using a regular class for implementing comparator
        sm.sort(new PriceComparator());
        sm.showAll();
        
        //method 2 using annonimous inner class
        sm.sort(new Comparator<Product>(){
            public int compare(Product o1, Product o2) {
                return o1.getQuantity()- o2.getQuantity();
            }
        });
        sm.showAll();
        
        //method 3 using lambda expression 
        sm.sort((x1, x2) ->(x1.getName().compareTo(x2.getName())) );
        sm.showAll();
        
    }
}


class PriceComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
    
}