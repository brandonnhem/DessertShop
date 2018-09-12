package inheritance;

import java.util.Scanner;

public class Candy extends DessertItem{
	
	private double price = 0.89;
	private double weight;
	
	public Candy(String name)
	{
		super(name);
	}
	
	public double getCost() 
	{
		getAmount();
		double cost = 0;
		cost = price * weight;
		cost = Math.round(cost * 100.0) / 100.0;
		return cost;
	}
	
	public void getAmount()
	{
		Scanner userInput;
		userInput = new Scanner(System.in);
		System.out.print("How much does the candy weigh: ");
		weight = userInput.nextDouble();
		userInput.close();
	}
}

