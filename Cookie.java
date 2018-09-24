package inheritance;

public class Cookie extends DessertItem {
	
	private double price = 3.99;
	private int amount;
	private int calorie;
	
	/**
	 * Constructor class that takes a name for the type of Cookie and the amount of the cookies.
	 * @param name	Name of the Cookie 
	 * @param amount How many cookies will weigh affecting it's cost by the dozen
	 */
	
	public Cookie(String name, int amount)
	{
		super(name);
		this.amount = amount;
	}
	
	/**
	 * Gets the cost of the Cookie by accounting for the amount at a set price per dozen.
	 * @return price The price of the cookies per dozen
	 */
	
	public double getCost()
	{
		double perDozen = amount / 12.0;
		double cost = perDozen * price;
		cost = Math.round(cost * 100.0) / 100.0;
		return cost;
	}
	
	/**
	 * Sets how many calories the type of Cookie will have
	 * @param calorie An added description of how much calorie a Cookie will have
	 */
	
	public void setCalorie(int calorie)
	{
		this.calorie = calorie;
	}
	
	/**
	 * Gets how many calories the type of Cookie has
	 * @return calorie The amount of calories the Cookie has
	 */
	
	public int getCalorie()
	{
		return calorie;
	}
	
	/**
	 * Gives one line of String for the type of Cookie to later be added together in the Checkout class. Formatted to look nice and neat
	 * @return receipt The final string with formatting of the Cookie to be printed out as one line of receipt
	 */
	
	public String getReceipt()
	{
		String receipt = ">>\t" + getName() + " Cookies : " + amount + "\n"
					   + "\t$" + price + " per dozen\t\t$" + getCost() + "\n";
		return receipt;
	}
	
	/**
	 * @return item Returns the string of the Cookie with each description of the Cookie
	 */
	
	public String toString()
	{
		String item = "Name: ";
		item += getName();
		item += "\nPrice: ";
		item += getCost();
		item += "\nCalories: ";
		item += getCalorie();
		return item;
	}
}