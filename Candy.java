package inheritance;

public class Candy extends DessertItem{
	
	private final static double FUDGE = 0.89,			// types of Candy
								MMS = 0.32,
								CRUNCH = 0.56,
								REESES = 0.63;
								
	private double weight;
	private int calorie;
	
	
	/**
	 * Constructor class that takes a name for the type of Candy and the weight of the candy.
	 * Please modify or add the constants if you would rather have a different kind of candy
	 * @param name	Name of the Candy 
	 * @param weight How much the candy will weigh affecting it's cost
	 */
	
	public Candy(String name, double weight)
	{
		super(name);
		this.weight = weight;
	}
	
	/**
	 * Gets the cost of the Candy by accounting for the weight at a set price per pound.
	 * @return price The price of the candy per pound
	 */
	
	public double getCost() 
	{
		double price = 0;
		if (name.equalsIgnoreCase("fudge"))
		{
			price = FUDGE;
		}
		else if (name.equalsIgnoreCase("M&MS"))
		{
			price = MMS;
		}
		else if (name.equalsIgnoreCase("crunch"))
		{
			price = CRUNCH;
		}
		else if (name.equalsIgnoreCase("reeses"))
		{
			price = REESES;
		}
		else
		{
			System.out.println("This item is not in our inventory");
			return 0;
		}
		double cost = 0;
		cost = price * weight;
		cost = Math.round(cost * 100.0) / 100.0;
		return cost;
	}
	
	/**
	 * Sets how many calories the type of candy will have
	 * @param calorie An added description of how much calorie a candy will have
	 */
	
	public void setCalorie(int calorie)
	{
		this.calorie = calorie;
	}
	
	/**
	 * Gets how many calories the type of candy has
	 * @return calorie The amount of calories the candy has
	 */
	
	public int getCalorie()
	{
		return calorie;
	}
	
	/**
	 * Gives one line of String for the type of candy to later be added together in the Checkout class. Formatted to look nice and neat
	 * @return receipt The final string with formatting of the candy to be printed out as one line of receipt
	 */
	
	public String getReceipt()
	{
		String receipt = "";
		if (name.equalsIgnoreCase("fudge"))
		{
			receipt = ">>\t" + getName() + " : " + weight + " lbs\n\t$" + FUDGE + " per lb " + "\t\t$" + getCost() + "\n";
		}
		else if (name.equalsIgnoreCase("M&MS"))
		{
			receipt = ">>\t" + getName() + " : " + weight + " lbs\n\t$" + MMS + " per lb " + "\t\t$" + getCost() + "\n";
		}
		else if (name.equalsIgnoreCase("crunch"))
		{
			receipt = ">>\t" + getName() + " : " + weight + " lbs\n\t$" + CRUNCH + " per lb " + "\t\t$" + getCost() + "\n";
		}
		else if (name.equalsIgnoreCase("reeses"))
		{
			receipt = ">>\t" + getName() + " : " + weight + " lbs\n\t$" + REESES + " per lb " + "\t\t$" + getCost() + "\n";
		}
		return receipt;
	}
	
	/**
	 * @return item Returns the string of the candy with each description of the candy
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

