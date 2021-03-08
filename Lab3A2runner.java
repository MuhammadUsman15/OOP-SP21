/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author boby computers
 */
public class Lab3A2runner {
    public static void main(String[]args){
        Time u = new Time();
        u.hr = 10;
        u.min = 15;
        u.sec = 20;
        u.showTime();
        Time u1 = new Time(12, 15, 20);
        u1.showTime();
    }    
    
}
