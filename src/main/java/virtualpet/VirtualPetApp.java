package virtualpet;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String name = null;
		int desiredAction = 0;

		VirtualPet yourPet = new VirtualPet(name, 50, 50, 50);

	System.out.println("Welcome to your Virtual Pet!");
	System.out.println("What would you like to name your pet?");
	name=input.nextLine();
	
	System.out.println("What would you like to do with " + name +"?");
	System.out.println("Enter 1 to feed ");
	System.out.println("2 to give water");
	System.out.println("3 to put down for a nap");
	System.out.println("4 to get current stats");
	
	do {
	yourPet.tick();
	System.out.println("What does " +name + " need now?");
	desiredAction=input.nextInt();
	
		if (yourPet.getEnergy() < 0) {
			System.out.println("You've neglected your pet. Energy is too low. Game Over");
			System.out.println("Look at what you did to poor " + name +"!");
			System.out.println("Hunger:" + yourPet.getHunger());
			System.out.println("Thirst:" + yourPet.getThirst());
			System.out.println("Energy:" + yourPet.getEnergy());
			System.exit(0);
		}
		if (yourPet.getHunger() > 100) {
			System.out.println("You've neglected your pet." + name + "is starving. Game Over.");
			System.out.println("Look at what you did to poor " + name +"!");
			System.out.println("Hunger:" + yourPet.getHunger());
			System.out.println("Thirst:" + yourPet.getThirst());
			System.out.println("Energy:" + yourPet.getEnergy());
			System.exit(0);
		}
		if (yourPet.getThirst() > 100) {
			System.out.println("You've neglected your pet." + name + "is dying of starvation. Game Over");
			System.out.println("Look at what you did to poor " + name +"!");
			System.out.println("Hunger:" + yourPet.getHunger());
			System.out.println("Thirst:" + yourPet.getThirst());
			System.out.println("Energy:" + yourPet.getEnergy());
			System.exit(0);
		}

		if (desiredAction == 1) {
			yourPet.feedPet();
			System.out.println("Your pet is eating...");

		} else if (desiredAction == 2) {
			yourPet.giveWater();
			System.out.println("Your pet is drinking water...");

		} else if (desiredAction == 3) {
			yourPet.layDownForNap();
			System.out.println("Great job! Your pet is taking a nap...");
		} else if (desiredAction == 4) {
			System.out.println("Here are " + name + "'s current stats!");
			System.out.println("Hunger:" + yourPet.getHunger());
			System.out.println("Thirst:" + yourPet.getThirst());
			System.out.println("Energy:" + yourPet.getEnergy());

		} else {
			System.out.println("That's not a valid choice. Try Again.");
		}
		
}	while (true);
	}
	}
	
