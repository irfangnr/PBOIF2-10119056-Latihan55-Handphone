/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan55.handphone;

/**
 *
 * @author ACER
 */
public class Android extends Handphone {
    private String keyStrore;

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        
    }

    public String getKeyStrore() {
        return keyStrore;
    }

    public void setKeyStrore(String keyStrore) {
        this.keyStrore = keyStrore;
    }
    
    
    
}
