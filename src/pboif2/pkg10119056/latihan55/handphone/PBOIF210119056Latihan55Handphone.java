/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan55.handphone;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Handphone
 */
public class PBOIF210119056Latihan55Handphone {

    public static void main(String[] args) {
        Android android=new Android("Samsung","Android","Grand",3000000);
        android.displayProduct();
        android.setKeyStrore("234ibfd3840fo");
        System.out.println("Android Key Store : "+android.getKeyStrore());
        System.out.println();
        
        BlackBerry blackberry=new BlackBerry("BlacB","RIM","Curve",2000000);
        blackberry.displayProduct();
        blackberry.setPinBB("BHS249");
        System.out.println("PIN : "+blackberry.getPinBB());
        System.out.println();
        
        WindowsPhone windowsphone=new WindowsPhone("Nokia","Win8","Lumia",1000000);
        windowsphone.displayProduct();
        windowsphone.setWpKeyStore("UUUQIJWORJ");
        System.out.println("PIN : "+windowsphone.getWpKeyStore());
    }
    
}
