/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs7.workTrucksMonitoring.service;

import isp.curs.curs7.workTrucksMonitoring.model.Truck;
import java.util.List;

/**
 *
 * @author mihai.hulea
 */
public interface ITracking {

    void addNewTruckRecord(double latitude, double longitude, String plateNumber);

    List<Truck> getALlRecordsByTruck(String plateNumber);

    List<Truck> getAllTruckRecords();

    List<Truck> getAllUnique();
    
}
