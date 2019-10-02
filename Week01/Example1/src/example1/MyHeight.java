/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author afernandez
 */
public class MyHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cm = 175.0;
        double in;
        double feet;
        in = cm / 2.54;
        feet = in/12;
        System.out.println( "" + cm + " cm is " + in + " inches or " + feet + " feet");
        System.exit(0);
    }
    
}
