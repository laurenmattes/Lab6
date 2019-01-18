import java.util.Random;
import java.util.Scanner;

public class Labs6 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		Random rand = new Random();

		int max = 6;
		int min = 1;
		int sides;
		int random;
		int Roll1;
		int Roll2;
		String userWantsToContinue = "y";

		do {
			System.out.println("How many sides are on your pair of dice?");
			sides = scnr.nextInt();

			Roll1 = generateRandomDiceRoll(sides);
			Roll2 = generateRandomDiceRoll(sides);

			System.out.println("Role 1: ");
			System.out.println(Roll1 + 1);
			System.out.println(Roll2 + 1);

			System.out.println("Do you want another table? (y/n)");
			userWantsToContinue = scnr.next();

		} while (userWantsToContinue.equals("y"));

		System.out.println("Goodbye.");
		scnr.close();
	}

	private static int generateRandomDiceRoll(int sides) {
		int random;
		Random rand = new Random();
		random = rand.nextInt(sides);
		return random;

	}
}
