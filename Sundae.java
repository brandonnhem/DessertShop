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
	
	public Sundae(String name, double price, String topping)
	{
		super(name, price);
		this.price = price;
		this.toppingName = topping;
	}
	
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
	
	public void setCalorie(int calorie)
	{
		this.calorie = calorie;
	}
	
	public int getCalorie()
	{
		return calorie;
	}
	
	public String getToppingsName()
	{
		return " Sundae with " + toppingName;
	}
	
	public String getReceipt()
	{
		String receipt = ">>\t" + getName() + " Sundae with " + toppingName + "\t$" + getCost() + "\n";
		return receipt;
	}
	
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
