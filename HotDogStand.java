/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotdogstand;

/**
 *
 * @author boby computers
 */
public class HotDogStand
{
	private int standsID;
	private int hotDogsSold;
	
	private static int totalHotDogsSold = 0;
	
	public HotDogStand()
	{
		standsID = 0;
		hotDogsSold = 0;
	}
	
	public HotDogStand(int newStandID, int newHotDogsSold)
	{
		standsID = newStandID;
		hotDogsSold = newHotDogsSold;
		totalHotDogsSold += newHotDogsSold;
	}
	
	public void justSold()
	{
		hotDogsSold++;
		totalHotDogsSold++;
	}
	
	public int getHotDogsSold()
	{
		return hotDogsSold;
	}
	
	public static int getTotalHotDogsSold()
	{
		return totalHotDogsSold;
	}
	
	public int getStandsID()
	{
		return standsID;
	}
	
		
}
    

