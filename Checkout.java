package inheritance;

import java.util.ArrayList;

public class Checkout{
	
	private ArrayList<DessertItem> items;
	private double taxRate = 7.25;
	private int numberOfItems;
	
	public Checkout()
	{
		items = new ArrayList<DessertItem>();
		numberOfItems = 0;
	}
	
	public void clear()
	{
		items.clear();
		System.out.println("Cleared!");
	}
	
	public void enterItem(DessertItem item)
	{
		System.out.println("Added " + item.getName());
		items.add(item);
		numberOfItems++;
	}
	
	public int numberOfItems()
	{
		return numberOfItems; 
	}
	
	public void display()
	{
		for (int i = 0; i < items.size() - 1; i++)
		{
			System.out.println(items.get(i).getName() + "\n");
		}
	}
	
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
	
	public double totalCost()
	{
		double cost = 0;
		for(int i = 0; i < items.size() - 1; i++)
		{
			cost += items.get(i).getCost();
		}
		return cost;
	}
	
	public double totalTax()
	{
		double totalTax = getTax() + totalCost();
		totalTax = Math.round(totalTax * 100.0) / 100.0;
		return totalTax;	
	}
	
	public double getTax()
	{
		double tax = taxRate / 100.0;
		tax *= totalCost();
		tax = Math.round(tax * 100.0) / 100.0;
		return tax;
	}
	
	public double getTaxRate()
	{
		return taxRate;
	}
	
	public void setTaxRate(double taxRateInput)
	{
		taxRate = taxRateInput;
	}

}
