package inheritance;

import java.util.ArrayList;
import java.util.Collections;

public class Checkout{
	
	private ArrayList<DessertItem> items;
	private double taxRate = 7.25;
	private int numberOfItems;
	
	/**
	 * Constructor for the Checkout class. Creates an ArrayList called items that holds DessertItem objects.
	 */
	
	public Checkout()
	{
		items = new ArrayList<DessertItem>();
		numberOfItems = 0;
	}
	
	/**
	 * Sorts the ArrayList through a bubble sort method
	 */
	
	public void sort()
	{
		
		/**
		 * WARNING! THIS METHOD IS BROKEN.
		 */
		for(int i = 0; i < items.size() - 1; i++)
		{
			for(int j = 0; j < items.size() - i - 1; j++)
			{
				if(items.get(j).compareTo(items.get(j + 1)) == 1)
				{
					DessertItem temp = items.get(j);
//					DessertItem temp2 = items.get(j + 1);
					items.set(j, items.get(j + 1));
					items.set(j + 1, temp);
				}
			}
		}
	}
	
	/**
	 * Clears the Checkout to begin checking out a new set of items
	 */
	
	public void clear()
	{
		items.clear();
		System.out.println("Cleared!");
	}
	
	/**
	 * A DessertItem is added to the end of the list of items
	 * @param item What item to add to the list
	 */
	
	public void enterItem(DessertItem item)
	{
//		System.out.println("Added " + item.getName());
		items.add(item);
		numberOfItems++;
	}
	
	/**
	 * Returns how many items are in the list
	 * @return numberOfItems Number of items in the list
	 */
	
	public int numberOfItems()
	{
		return numberOfItems; 
	}
	
	/**
	 * Prints out every item in the list
	 */
	
	public void display()
	{
		for (int i = 0; i < items.size() - 1; i++)
		{
			System.out.println(items.get(i).getName() + "\n");
		}
	}
	
	/**
	 * Returns a String representing a receipt for the current list of items
	 * @return receipt The entire list formatted to look nicely
	 */
	
	public String toString()
	{		
		String receipt = "\n\t------ Dessert Shop ------\n";
		receipt += "\n\tNumber of items: " + numberOfItems() + "\n\tYou ordered: \n";
		for (int i = 0; i < items.size() - 1; i++)
		{
			receipt += "\n";
			receipt += items.get(i).getReceipt();
		}
		receipt += "\n\tSubtotal: \t\t$";
		receipt += totalCost();
		receipt += "\n";
		receipt += "\tTax: \t\t\t$";
		receipt += getTax();
		receipt += "\n\tTotal Cost: \t\t$";
		receipt += totalTax();
		receipt += "\n";
		return receipt;
	}
	
	/**
	 * Returns total cost of items in cents (without tax)
	 * @return cost The cost of the items in the list without tax
	 */
	
	public double totalCost()
	{
		double cost = 0;
		for(int i = 0; i < items.size() - 1; i++)
		{
			cost += items.get(i).getCost();
		}
		return cost;
	}
	
	/**
	 * Calculates how much the entire total is including tax and the subtotal
	 * @return totalTax The total cost of the receipt including tax
	 */
	
	public double totalTax()
	{
		double totalTax = getTax() + totalCost();
		totalTax = Math.round(totalTax * 100.0) / 100.0;
		return totalTax;	
	}
	
	/**
	 * Calculates how much sales tax is
	 * @return tax The amount of sales tax is required for the subtotal
	 */
	
	public double getTax()
	{
		double tax = taxRate / 100.0;
		tax *= totalCost();
		tax = Math.round(tax * 100.0) / 100.0;
		return tax;
	}
	
	/**
	 * Returns the amount of tax rate for this purchase
	 * @return taxRate The amount of tax rate
	 */
	
	public double getTaxRate()
	{
		return taxRate;
	}
	
	/**
	 * Change the value of the tax rate, defaulted at 7.25
	 * @param taxRateInput How much the tax rate should be set to
	 */
	
	public void setTaxRate(double taxRateInput)
	{
		taxRate = taxRateInput;
	}

}
