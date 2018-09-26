package inheritance;

public class Sundae extends IceCream {

	private double price;
	private final static double CARAMEL = 1.25,
								SPRINKLES = 0.25,
								NUTS = 0.30,
								BANANA = 2.00,
								CHOCOLATE = .75;
	private String toppingName;
	private int calorie;
	
	/**
	 * The constructor for the Sundae class which extends the IceCream class. The difference between the two is the Sundae class
	 * comes with toppings. 
	 * @param name Name of the Sundae
	 * @param price Price for the Sundae
	 * @param topping Name of the toppings that go on the Sundae
	 */
	
	public Sundae(String name, double price, String topping)
	{
		super(name, price);
		this.price = price;
		this.toppingName = topping;
	}
	
	/**
	 * Determines the cost of the Sundae depending on which toppings are selected.
	 * @return cost The cost of the Sundae with the topping
	 */
	
	public double getCost()
	{
		double cost = 0;
		if(toppingName.equalsIgnoreCase("caramel"))
		{
			cost = price + CARAMEL;
		}
		else if(toppingName.equalsIgnoreCase("sprinkles"))
		{
			cost = price + SPRINKLES;
		}
		else if(toppingName.equalsIgnoreCase("nuts"))
		{
			cost = price + NUTS;
		}
		else if(toppingName.equalsIgnoreCase("banana"))
		{
			cost = price + BANANA;
		}
		else if(toppingName.equalsIgnoreCase("chocolate"))
		{
			cost = price + CHOCOLATE;
		}
		return cost;
	}
	
	/**
	 * Sets the calorie for the Sundae
	 * @param calorie How much calories to set for the Sundae
	 */
	
	public void setCalorie(int calorie)
	{
		this.calorie = calorie;
	}
	
	/**
	 * Gets how many calories the Sundae has
	 * @return calorie How many calories the Sundae has
	 */
	
	public int getCalorie()
	{
		return calorie;
	}
	
	/**
	 * Provides the name of the toppings as a string
	 * @return toppingName The name of the toppings
	 */
	
	public String getToppingsName()
	{
		return toppingName;
	}
	
	/**
	 * One receipt line for the Sundae including the topping with proper formatting
	 * @return receipt The line for one order of the Sundae with the toppings
	 */
	
	public String getReceipt()
	{
		String receipt = ">>\t" + getName() + " Sundae with " + toppingName + "\t$" + getCost() + "\n";
		return receipt;
	}
	
	/**
	 * A string for the DessertItem
	 * @return item The string printed out of the Sundae
	 */
	
	public String toString()
	{
		String item = "Name: ";
		item += getName();
		item += "\nToppings: ";
		item += getToppingsName();
		item += "\nPrice: ";
		item += getCost();
		item += "\nCalories: ";
		item += getCalorie();
		return item;
	}
}
