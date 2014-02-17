/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pewarisan2;

/**
 *
 * @author asadil
 */
public class staf extends pegawai{
    double lembur;
    staf(){
        nama="staf";
        lembur=90;
    }
    public void tampil(){
    System.out.println("nama :"+getNama());
    System.out.println("gaji :"+getGaji());
    System.out.println("lemburan :"+lembur);
        System.out.println("total gaji :"+ (getGaji()+lembur));
    }
    
}
