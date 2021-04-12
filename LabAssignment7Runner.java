/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypizza;
import java.util.Scanner;

public class LabAssignment7Runner {
    public static void main(String[] args) {
		
		String size;
		int cheese;
		int pepperoni;
		int ham;
		
	MyPizza pizzaa=new MyPizza();
	
	Scanner keyboard= new Scanner(System.in);
	
	System.out.println("Enter size of pizza: ");
	size=keyboard.nextLine();
	System.out.println("Enter amount of cheese: ");
	cheese=keyboard.nextInt();
	System.out.println("Enter amount of pepperoni: ");
	pepperoni=keyboard.nextInt();
	System.out.println("Enter amount of ham: ");
	ham=keyboard.nextInt();
	
	pizzaa.setSize(size);
	pizzaa.setCheese(cheese);
	pizzaa.setPepperoni(pepperoni);
	pizzaa.setHam(ham);
	
	double calcCost = pizzaa.calcCost(size,cheese, pepperoni, ham);
	System.out.println("Cost is: "+calcCost);
	String getDescription=pizzaa.getDescription();
	System.out.println(getDescription);
}
}
    
