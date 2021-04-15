/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.isp.uidemo.mvc.app;

import isp.curs.isp.uidemo.mvc.AbstractModel;


/**
 *
 * @author mihai.hulea
 */
public class Compressor extends AbstractModel{
    private CompressorStatus status;

    public CompressorStatus getStatus() {
        return status;
    }

    public void setStatus(String any) {
       
        CompressorStatus old = this.status;       
        if(status == CompressorStatus.OFF)
            status = CompressorStatus.ON;
        else
            status =CompressorStatus.OFF;
        this.firePropertyChange("value", old, status);
        System.out.println("Compressor status has been updated to: "+status);
    }
    
}
