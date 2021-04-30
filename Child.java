
package a;

class Child extends Clock{
    public Child(String hours, String minutes, String seconds){
        super(hours, minutes, seconds);
    }
    @Override
    public void show(){
        System.out.println("24 Hour Format:");
        super.show();
        System.out.println("AM/PM Format:");
        int hour1 = (int)hr.charAt(0) - '0';
        int hour2 = (int)hr.charAt(1)- '0';
        int hour3 = hour1 * 10 + hour2;
        String u;
        if(hour3 < 12)
            u="AM";
        else
            u="PM";
        hour3 %= 12;
        if (hour3 == 0) {
            System.out.print("12"+":"+min+":"+sec);
        }
        else{
            System.out.print(hour3);
            System.out.print(":"+min+":"+sec);
        }
        System.out.println(" "+u);
    }
}
