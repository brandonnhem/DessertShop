package inheritance;

public class IceCream extends DessertItem {
	
	double chocolatePrice = 4.0;
	double vanillaPrice = 3.0;
	double strawberryPrice = 4.0;
	
	public IceCream(String name)
	{
		super(name);
	}
	
	public double getCost()
	{
		if(name == "Chocolate")
		{
			return chocolatePrice;
		}
		else if(name == "Vanilla")
		{
			return vanillaPrice;
		}
		else if(name == "Strawberry")
		{
			return strawberryPrice;
		}
		else
		{
			return 0.0;
		}
	}
}
