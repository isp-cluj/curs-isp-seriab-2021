/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.isp.uidemo.mvc.app;

import isp.curs.isp.uidemo.mvc.AbstractController;

/**
 *
 * @author mihai.hulea
 */
public class HvacMvcController extends AbstractController {
    public static final String COMPRESSOR_STATUS = "Status";
    
    public void setCompressorStatus(String newValue){
        System.out.println("COMPRESSOR STATUS:"+newValue);
        this.setModelProperty(COMPRESSOR_STATUS, newValue);
    }
    
}
