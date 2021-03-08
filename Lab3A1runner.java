/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marks;

/**
 *
 * @author cui
 */
public class Lab3A1runner {
    public static void main(String[]args){
        Marks m = new Marks();
        System.out.println("Sum of marks are: "+ m.CalculateSum());
        Marks m1 = new Marks(89,98,90);
        System.out.println("Sum of marks are: "+m1.CalculateSum());
    }
    
}
