package isp.curs.curs12.reflexia;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.*;

public class TestCar {
    
    public static void inspectObject(Car object){
        Class<?> clazz = object.getClass();

        Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
           System.out.println(constructor);
        }
        
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }


    }
    
    public static void test1() throws Exception{
        Car myCar = new Car();
        Field privateField = Car.class.getDeclaredField("maxSpeed");
        privateField.setAccessible(true);
        Integer fieldValue = (Integer) privateField.get(myCar);        
        System.out.println("Max car speed is = " + fieldValue);
    }
    
    public static void test2() throws Exception{
        Car myCar = new Car();
        Method privateMethod = Car.class.getDeclaredMethod("setSpeedLimit", Integer.class);
        privateMethod.setAccessible(true);
        privateMethod.invoke(myCar, 300);
    }
    
    public static void test3() throws Exception{      
        Car c = (Car)Car.class.getConstructor().newInstance();
        System.out.println(c);
    }
    
    public static void main(String[] args) throws Exception {
        Car myCar = new Car();
        //inspectObject(myCar);
        
        //System.out.println(myCar.);
        //test1();
        //test2();
        test3();
    }
}
