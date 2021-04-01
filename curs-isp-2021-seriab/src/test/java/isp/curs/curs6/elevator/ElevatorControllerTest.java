/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs6.elevator;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mihai.hulea
 */
public class ElevatorControllerTest {

    Elevator e;
    Door d;
    ElevatorController ec;
    
    /**
     * We initialize controler before each tests to have a clean object.
     */
    @Before
    public void init(){
        e = new Elevator();
        d = new Door();
        ec = new ElevatorController(e, d);
    }
    
    @Test
    public void testElevatorisMoving() throws InterruptedException{
        ec.sendCommand(new Command(3));
        ec.control();
        assertEquals("Should be at level 3", 3, e.getFloor());
        
    }
    
}
