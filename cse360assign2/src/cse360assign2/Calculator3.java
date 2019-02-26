/* Name: Bryanna Donovan
 * Class ID: 364
 * Assignment 2
 */

package cse360assign2;

import java.util.*;

/**
 *  The Calculator class will act like a real calculator and add, subtract,
 * multiply, and divide to return the total after the operations.
 * 
 * @author Bryanna Donovan
 */

public class Calculator3 
{

	private int total;
	LinkedList<String> history = new LinkedList<String>();
	
	/** 
	 * The constructor of the class Calculator
	 */
	
	public Calculator3 () 
	{
		total = 0;  // not needed - included for clarity
		history.add("0");
	}
	
	/**
	 * Returns the total after being calculated
	 * @return	the total
	 */
	
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * This will add the parameter to the total value and store it in total.
	 * @param value	an integer to add to the total
	 */
	
	public void add (int value) 
	{
		total = total + value;
		history.add(" + " + value);
	}
	
	/**
	 * This will subtract the parameter from the total and store it in total.
	 * @param value	an integer to subtract from the total
	 */
	
	public void subtract (int value) 
	{
		total = total - value;
		history.add(" - " + value);
	}
	
	/**
	 * This will multiply the parameter by the total and store it in total.
	 * @param value	an integer to multiply to the total
	 */
	
	public void multiply (int value) 
	{
		total = total * value;
		history.add(" * " + value);
	}
	
	/**
	 * This will divide the total by the parameter and store it in total.
	 * @param value	an integer to divide the total by
	 */
	
	public void divide (int value) 
	{
		if (value == 0)
		{
			total = 0;
			history.add(" /  0");
		}
		else 
		{
			total = total / value;
			history.add(" / " + value);
		}
	}
	
	/**
	 * Returns the history of all actions as a String
	 * @return	string with all of the history of previous actions
	 */
	
	public String getHistory() 
	{
		String stringHistory = "";
		for (int index = 0; index < history.size(); index++)
		{
			stringHistory = stringHistory + history.get(index);
		}
		
		return stringHistory;
	}
}
