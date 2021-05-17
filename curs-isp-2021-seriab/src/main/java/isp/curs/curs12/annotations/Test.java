/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs12.annotations;

import isp.curs.curs12.reflexia.Sensor;
import java.lang.reflect.*;




/**
 *
 * @author mihai.hulea
 */
public class Test {
    
    
    @MyAnnotation(value1 = "Foo", value2 = 1337)
    public void testAnnotation() throws Exception {
	
        Method[] methods = getClass().getMethods();
	Method method = methods[0];
        System.out.println("Check annotations for method:"+method.getName());
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
	System.out.println("value1="+annotation.value1());
	System.out.println("value2="+annotation.value1());
	
    }   
    
    public static void main(String[] args) throws Exception {
        Test t1 = new Test();
        t1.testAnnotation();
        
        Sensor s1 = new Sensor();
        
    }

}
