
package a;
    class Clock{
    String hr, min, sec;


    public Clock(String hours, String minutes, String seconds){
        hr=hours;
        min=minutes;
        sec=seconds;
    }
    public void show(){
        System.out.println(hr+":"+min+":"+sec);
    }
}