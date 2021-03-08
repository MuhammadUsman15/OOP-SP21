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
public class Time {

    public int hr,min,sec;
    public Time(){
        hr = 0;
        min = 0;
        sec =0; 
    }
    public Time(int hours,int mintues,int seconds){
    hr = hours;
    min = mintues;
    sec = seconds;
    }
    public void showTime(){
    if (hr>24||min>60||sec>60){
        System.out.println("ivalid time");
    }
    else
           System.out.println("time is : "+hr+":"+min+":"+sec);
    }
}