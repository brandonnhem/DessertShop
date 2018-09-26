/*   Brandon Nhem
     Anthony Pham
     September 25, 2019
     Purpose: This is the DessertItem class that is extended for the Candy, Cookie, IceCream, and Sundae Class
     Inputs: setCalorie()
     Outputs: compareTo(), max(), getCost(), getCalorie()
*/

package inheritance;

public class IceCream extends DessertItem {
	private double price;
	private int calorie;
	
	/**
	 * Constructor class that takes a name for the type of IceCream
	 * @param name	Name of the IceCream 
	 * @param price How much the IceCream will cost
	 */
	
	public IceCream(String name, double price)
	{
		super(name);
		this.price = price;
	}
	
	/**
	 * Gets the cost of the IceCream
	 * @return price The price of the IceCream
	 */
	
	public double getCost()
	{
		return price;
	}
	
	/**
	 * Sets how many calories the type of IceCream will have
	 * @param calorie An added description of how much calorie a IceCream will have
	 */
	
	public void setCalorie(int calorie)
	{
		this.calorie = calorie;
	}
	
	/**
	 * Gets how many calories the type of IceCream has
	 * @return calorie The amount of calories the IceCream has
	 */
	
	public int getCalorie()
	{
		return calorie;
	}
	
	/**
	 * Gives one line of String for the type of IceCream to later be added together in the Checkout class. Formatted to look nice and neat
	 * @return receipt The final string with formatting of the IceCream to be printed out as one line of receipt
	 */
	
	public String getReceipt()
	{
		String receipt = ">>\t" + getName() + " Ice Cream\t$" + getCost() + "0\n";
		return receipt;
	}
	
	/**
	 * @return item Returns the string of the IceCream with each description of the IceCream
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
