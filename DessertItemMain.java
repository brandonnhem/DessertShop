package inheritance;

public class DessertItemMain {

	public static void main(String[] args) {
		
		Checkout register = new Checkout();
		
		DessertItem fudge = new Candy("Fudge", 2.30);
		DessertItem reeses = new Candy("Reeses", 3.30);
		DessertItem vanilla = new IceCream("Vanilla", 3.00);
		DessertItem chocolate = new IceCream("Chocolate", 4.00);
		DessertItem chocolateChip = new Cookie("Chocolate Chip", 4);
		DessertItem peanutButter = new Cookie("Peanut Butter", 7);
		DessertItem split = new Sundae("Split", 5.55, "Nuts");
		
		fudge.setCalorie(500);
		reeses.setCalorie(200);
		vanilla.setCalorie(150);
		chocolate.setCalorie(200);
		chocolateChip.setCalorie(300);
		peanutButter.setCalorie(250);
		split.setCalorie(700);
		
		System.out.println("\ncompareTo sample: Fudge v. Reeses\n");
		System.out.println("The larger item is..");
		System.out.println(DessertItem.max(fudge, reeses));
		System.out.println("\ncompareTo sample: Fudge v. Chocolate Chip Cookies\n");
		System.out.println("The larger item is..");
		System.out.println(DessertItem.max(fudge, chocolateChip));
		
		register.enterItem(split);
		register.enterItem(peanutButter);
		register.enterItem(chocolateChip);
		register.enterItem(chocolate);
		register.enterItem(vanilla);
		register.enterItem(reeses);
		register.enterItem(fudge);
		
		register.sort();
		
		register.display();
		
		System.out.println("--------------- RECEIPT SECTION ---------------\n");
		
		System.out.println(register.toString());
	}

}
