
package lab9assignment2;

import java.util.*;
public class Lab9Assignment2 {
    public static int countTokens(StringTokenizer u){
        int count=u.countTokens(), fCount=0;
        String temp;
        boolean fg;
        double Value;
        for(int i=0;i<count;i++){
            fg=true;
            temp=u.nextToken();
            try{
                Value = Double.parseDouble(temp);
            }
            catch(NumberFormatException m){
                fg=false;
            }
            if(!fg)
                fCount++;
        }
        return fCount;
    }
    

    
}
