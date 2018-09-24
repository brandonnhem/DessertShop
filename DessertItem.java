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
  
  public interface Comparable
  {
	  int compareTo(Object otherObject);
  }
  
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
}





