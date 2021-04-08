/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs7.workTrucksMonitoring;

import isp.curs.curs7.workTrucksMonitoring.service.TrackingVehicleService;
import isp.curs.curs7.workTrucksMonitoring.repository.TruckFileJsonRepository;
import isp.curs.curs7.workTrucksMonitoring.view.MapViewerJFrame;
import java.util.List;
import static java.util.stream.Collectors.toList;
import org.jxmapviewer.viewer.GeoPosition;

/**
 *
 * @author mihai.hulea
 */
public class App1 {
    public static void main(String[] args) {
        TruckFileJsonRepository repo = new TruckFileJsonRepository("c:\\curs7");
        TrackingVehicleService serv = new TrackingVehicleService(repo);
        
//        serv.addNewTruckRecord(46.770439, 23.591423, "CJ-01-ABC");
//        serv.addNewTruckRecord(46.06667, 23.58333, "CJ-01-ABC");
//        serv.addNewTruckRecord(46.5531,24.5984, "CJ-01-ABC");
//        
//        serv.addNewTruckRecord(46.06667, 23.58333, "CJ-99-GTT");
//        serv.addNewTruckRecord(46.5531,24.5984, "CJ-99-GTT");
//        
        
        serv.getAllUnique().stream().forEach(s -> System.out.println(s));
        System.out.println("....");
        serv.getALlRecordsByTruck("CJ-01-ABC").stream().forEach(System.out::println); //using method reference
//


        MapViewerJFrame viewer = new MapViewerJFrame();
        List<GeoPosition> locations = 
                serv.getALlRecordsByTruck("CJ-01-ABC").stream()
                        .map(truck -> new GeoPosition(truck.getLatitude(),truck.getLongitudel()))
                        .collect(toList());
                
        viewer.updateRoute(locations);
        viewer.setVisible(true);
    }
}
