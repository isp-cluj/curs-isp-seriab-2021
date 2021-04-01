/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs6.elevator;

import java.util.ArrayList;

/**
 *
 * @author mihai.hulea
 */
public class Observable{
    private ArrayList<Observer> entities = new ArrayList<>();
    
    public void addObserver(Observer e){
        entities.add(e);
    }
    
    public void changeState(String event){
        for(Observer o: entities)
            o.update(event);
    }
}

