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
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
    
       manager ph= new manager();
       ph.tampil();
       System.out.println("======================");
       
      
       staf st= new staf();
       st.tampil();
       System.out.println("======================");  
    }
    
}
