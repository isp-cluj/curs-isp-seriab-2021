/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.isp.uidemo.mvc.app;

/**
 *
 * @author mihai.hulea
 */
public class HvacApp {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        Compressor compressor = new Compressor();
        HvacMvcController ctrl = new HvacMvcController();
        HvacJFrame ui = new HvacJFrame(ctrl);
        
        ctrl.addModel(sensor);
        ctrl.addModel(compressor);
        ctrl.addView(ui);
        
        
        ui.setVisible(true);
        new Thread(sensor).start(); // lanseasa in executie un fir (thread) - de discutat in urmatorul curs 
    }
}
