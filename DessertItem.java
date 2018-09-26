package inheritance;

public abstract class DessertItem implements Comparable{

  protected String name;

/**
 * Null constructor for DessertItem class
 */
  public DessertItem() {
    this("");
  }
/**
 * Initializes DessertItem data
 */
  public DessertItem(String name) {
      this.name = name;
      }
/**
 * Returns name of DessertItem
 * @return name of DessertItem
 */
  public final String getName() {
    return name;
  }
/**
 * Returns cost of DessertItem
 * @return cost of DessertItem
 */
  public abstract double getCost();
  
  public abstract String getReceipt();
  
  public abstract void setCalorie(int calorie);
  
  public abstract int getCalorie();
  
  public int compareTo(Object otherObject)
  {
	  DessertItem otherDessert = (DessertItem) otherObject;
	  if (getCost() < otherDessert.getCost())
	  {
		  return -1;
	  }
	  if (getCost() > otherDessert.getCost())
	  {
		  return 1;
	  }
	  else
	  {
		  return 0;
	  }
  }
  
 //TODO: create max() method
  
  public static DessertItem max(DessertItem firstDessert, DessertItem secondDessert)
  {
	  if(firstDessert.compareTo(secondDessert) == 1)
	  {
		  return firstDessert;
	  }
	  else if(firstDessert.compareTo(secondDessert) == -1)
	  {
		  return secondDessert;
	  }
	  else
	  {
		  return firstDessert;
	  }
  }
 //TODO: sort ArrayList
}





