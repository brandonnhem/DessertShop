/*   Brandon Nhem
     Anthony Pham
     September 25, 2019
     Purpose: This is the DessertItem class that is extended for the Candy, Cookie, IceCream, and Sundae Class
     Inputs: name
     Outputs: compareTo(), max(), getCost(), getCalorie()
*/


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
  
  /**
   * Compares two objects together and sees which one is greater than the other price wise
   * @params otherObject The other object to be compared to the initial object 
   */
  
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
  
 /**
  * Using the compareTo method, the max method returns the larger between the two.
  * @param firstDessert The first dessert to be compared to
  * @param secondDessert The second dessert to be compared to
  * @return Whichever dessert is larger, if they are both equal, then the firstDessert will be returned
  */
  
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
}





