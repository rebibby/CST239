package afstore;

public class SalableItems {
public static void main(String[] args) {
		
		//Created class for ArmorItems 
		//For method ArmorItems
		
		//New item Leather Armor
		ArmorItems LeatherArmor= new ArmorItems();
		
		//Defined quantity
		LeatherArmor.setQuantitya(4);
		
		//Defined price
		LeatherArmor.setPricea(15);
		
		//Defined description
		LeatherArmor.setDescriptiona("Lightest and weakest armor set, includes chestplate, pants, and boots");
		
		//New item Iron Armor
		ArmorItems IronArmor = new ArmorItems();
		
		//Define quantity
		IronArmor.setQuantityb(5);
		
		//Define price
		IronArmor.setPriceb(30);
		
		//Define description
		IronArmor.setDescriptionb("Made of heavier materials which are strong against weapons, includes helmet, chestplate, pants, and boots");
		
		//New item Diamond Armor
		ArmorItems DiamondArmor = new ArmorItems();
		
		//Define quantity
		DiamondArmor.setQuantityc(2);
		
		//Define price
		DiamondArmor.setPricec(60);
		
		//Define description
		DiamondArmor.setDescriptionc("Strongest material, includes helmet, chestplate, pants, boots, and shield");
		
		//Created class for WeaponItems
		//For method WeaponItems
		//Line Break
		
		WeaponItems WoodBowArrows= new WeaponItems();
		
		//Define quantity
		WoodBowArrows.setQuantityd(8);
		
		//Define price
		WoodBowArrows.setPriced(10);
		
		//Define description
		WoodBowArrows.setDescriptiond("Lightest weapon, easy for carrying, least damage");
		
		WeaponItems IronAxe= new WeaponItems();
		
		//Define quantity
		IronAxe.setQuantitye(5);
		
		//Define price
		IronAxe.setPricee(25);
		
		//Define description
		IronAxe.setDescriptione("Heavy, solid axe used with one hand that lasts longer and is stronger against armor");
		
		WeaponItems DiamondSword= new WeaponItems();
		
		//Define quantity
		DiamondSword.setQuantityf(3);
		
		//Define price
		DiamondSword.setPricef(50);
		
		//Define description
		DiamondSword.setDescriptionf("Strongest weapon held with two hands,  however is heaviest to carry");
		
		//Created class for HealthItems
		//For method HealthItems
		//Line Break
		
		HealthItems WaterBottle= new HealthItems();
		
		//Define quantity
		WaterBottle.setQuantityg(10);
		
		//Define price
		WaterBottle.setPriceg(5);
		
		//Define description
		WaterBottle.setDescriptiong("Recovers light health, one time use");
		
		HealthItems FirstAidKit= new HealthItems();
		
		//Define quantity
		FirstAidKit.setQuantityh(5);
		
		//Define price
		FirstAidKit.setPriceh(20);
		
		//Define description
		FirstAidKit.setDescriptionh("Recovers health and is able to be used while fighting");
		
		HealthItems Defibrillator=new HealthItems();
		
		//Define quantity
		Defibrillator.setQuantityi(3);
		
		//Define price
		Defibrillator.setPricei(35);
		
		//Define description
		Defibrillator.setDescriptioni("Recovers max health, requires both hands to use");
		
		//Line Break
		
		//What user can buy and execute functions
		//Data will be pushed and pulled back to the shopping cart
		//line breaks are added for easy scrolling and reading
		
		System.out.println("The Store");
		
		//LineBreak
		System.out.println(" ");
		
		System.out.println(" Armor For Sale");
		System.out.println(" --------------");
		
		//Shows inventory for LeatherArmor
		//Line Break
		System.out.println("  ");
		
		//Shows the current quantity 
		System.out.println("The current quantity for Leather Armor is " + LeatherArmor.getQuantitya());
		
		//Shows the current price
		System.out.println("The current price of Leather Armor is " + LeatherArmor.getPricea() + " gold");
		
		//Shows the description
		System.out.println(LeatherArmor.getDescriptiona());
		
		//Shows inventory for IronArmor
		//Line Break
		System.out.println("  ");
		
		//Shows the user the current quantity
		System.out.println("The current quantity for Iron Armor is " + IronArmor.getQuantityb());
		
		//Shows the current price
		System.out.println("The current price of Iron Armor is " + IronArmor.getPriceb() + " gold");
		
		//Shows the description
		System.out.println(IronArmor.getDescriptionb());
		
		//Shows inventory for DiamondArmor
		//Line Break
		System.out.println("  ");
		
		//Shows the user the current quantity
		System.out.println("The current quantity for Diamond Armor is " + DiamondArmor.getQuantityc());
		
		//Shows the current price
		System.out.println("The current price of Diamond Armor is " + DiamondArmor.getPricec() + " gold");
		
		//Shows the description
		System.out.println(DiamondArmor.getDescriptionc());
		
		//Line Break
		System.out.println("  ");
		
		System.out.println(" Weapons For Sale");
		System.out.println(" ----------------");
		
		//Shows inventory for WoodBowArrows
		//Line Break
		System.out.println("  ");
		
		//Shows the current quantity 
		System.out.println(" There are currently " + WoodBowArrows.getQuantityd() + " Wooden Bow and Arrows for sale");
		
		//Shows the current price
		System.out.println("The current price of a Wooden Bow and Arrows is " + WoodBowArrows.getPriced() + " gold");
		
		//Shows the description
		System.out.println(WoodBowArrows.getDescriptiond());

		//Shows inventory for IronAxe
		//LineBreak
		System.out.println("  ");
		
		//Shows the current quantity 
		System.out.println(" There are currently " + IronAxe.getQuantitye() + " Iron Axe for sale");
		
		//Shows the current price
		System.out.println("The current price of a Iron Axe is " + IronAxe.getPricee() + " gold");
		
		//Shows the description
		System.out.println(IronAxe.getDescriptione());
		
		//Shows inventory for DiamondSword
		//Line Break
		System.out.println("  ");
		
		//Shows the current quantity 
		System.out.println(" There are currently " + DiamondSword.getQuantityf() + " Diamond Sword for sale");
		
		//Shows the current price
		System.out.println("The current price of a Diamond Sword is " + DiamondSword.getPricef() + " gold");
		
		//Shows the description
		System.out.println(DiamondSword.getDescriptionf());
		
		//Line Break
		System.out.println("  ");
				
		System.out.println(" Health Items For Sale");
		System.out.println(" ----------------");
		
		//Shows inventory for WaterBottle
		//Line Break
		System.out.println("  ");
		
		//Shows the current quantity 
		System.out.println(" There are currently " + WaterBottle.getQuantityg() + " Water Bottle for sale");
		
		//Shows the current price
		System.out.println("The current price of a Water Bottle is " + WaterBottle.getPriceg() + " gold");
		
		//Shows the description
		System.out.println(WaterBottle.getDescriptiong());
		
		//Shows inventory for FirstAidKit
		//Line Break
		System.out.println("  ");
		
		//Shows the current quantity 
		System.out.println(" There are currently " + FirstAidKit.getQuantityh() + " First Aid Kit for sale");
		
		//Shows the current price
		System.out.println("The current price of a First Aid Kit is " + FirstAidKit.getPriceh() + " gold");
		
		//Shows the description
		System.out.println(FirstAidKit.getDescriptionh());
		
		//Shows inventory for Defibrillator
		//Line Break
		System.out.println("  ");
		
		//Shows the current quantity 
		System.out.println(" There are currently " + Defibrillator.getQuantityi() + " Defibrillator for sale");
		
		//Shows the current price
		System.out.println("The current price of a Defibrillator is " + Defibrillator.getPricei() + " gold");
		
		//Shows the description
		System.out.println(Defibrillator.getDescriptioni());
		
		//Line Break
		System.out.println("  ");
		
}
}

