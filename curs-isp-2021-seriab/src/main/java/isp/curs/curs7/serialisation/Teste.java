/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs7.serialisation;

import isp.curs.curs7.files.FilesAndFoldersUtil;
import java.io.IOException;

/**
 *
 * @author mihai.hulea
 */
public class Teste {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Vehicle v = new Vehicle("CJ-99-ABC", "1", "2", 100);
        //FilesAndFoldersUtil.createFolder("c:\\curs7");
        //SerializableVehicleUtil.writeVehicle(v, "c:\\curs7\\vehicle1.dat");
    
        Vehicle c = SerializableVehicleUtil.readVehicle("c:\\curs7\\vehicle1.dat");
        System.out.println(c);
    }
 
}
