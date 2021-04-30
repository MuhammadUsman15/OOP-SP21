
package lab9assignment2;

import java.util.*;
import static lab9assignment2.Lab9Assignment2.countTokens;
public class Lab9Assignment2Runner {
        public static void main(String args[]) {
        StringTokenizer u1 = new StringTokenizer("My name is Usman");
        StringTokenizer u2 = new StringTokenizer("I am from Comsats University");
        int count = countTokens(u1);
        System.out.println("Tokens of 1st string: " + count);
        count = countTokens(u2);
        System.out.println("Tokens of 2nd string: "+ count);
        }
}