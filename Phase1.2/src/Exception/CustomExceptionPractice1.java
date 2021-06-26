package Exception;

import java.util.Scanner;

public class CustomExceptionPractice1 {
	
	static int impactOfAttack(int damage) throws LethalityException {
		if (damage < 40) {
			throw new LethalityException("You dealt too little damage to the troll.");
		} if (damage >= 40 && damage <= 75) {
			throw new LethalityException("You're attack was effective!");
		} if (damage >75 && damage <= 160) {
			throw new LethalityException("The troll could not handle your fork knife and perished!");
		} else {
			System.out.println("You developed amnesia and succumbed to life. So sorry...");
		} return 		
				damage;
	}
	
	public static void main(String args[]) {
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("A BIG UGLY troll is blocking your passage to The Great Beyond.");
		System.out.println("The troll starts to creep towards you.");
		System.out.println("You take out your Majestic weapon and attack!");
		System.out.println("Roll a 20-sided dice and multiply the result by (5 + amount of your weapon expertise).");
		System.out.println("The result is your attack damage.");
		System.out.println("Enter your attack damage now: ");
		int damage = scan.nextInt();
		scan.close();
		
		try {
			result = impactOfAttack(damage);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("You dealt " + damage + " attack damage. You are pumped up!. Things are about to heat up now!");
	}	
}

class LethalityException extends Exception {
	
	LethalityException(String s) {
	super(s);
	}
}