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
class manager extends pegawai{
    double tunjangan;
    double bonus;
    manager(){
    nama="hafid";
    tunjangan=100;
    bonus=10;
    }
     public void tampil(){
       System.out.println("nama :"+getNama());
       System.out.println("gaji :"+getGaji());
       System.out.println("bonus :"+bonus);
       System.out.println("tunjangan :" +tunjangan);
       System.out.println("total gaji :" +(tunjangan + bonus + getGaji()));
    }

}