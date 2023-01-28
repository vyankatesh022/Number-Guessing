import java.util.*;

public class Guess_Number {
	static Scanner s = new Scanner(System.in);
	static Random r = new Random();

	static void game() {
		System.out.println("Enter the choice to guess  between number\n1.1 to 25\n2.1 to 50\n3.1 to 100");
		int a1 = s.nextInt();
		int b1, i,b;
		switch (a1) {
		case 1:
			b = r.nextInt(25);
			for (i = 0; i < 5; i++) {
				System.out.println("Guess the no.");
				b1 = s.nextInt();
				if (b == b1) {
					System.out.println("Congrats you guess the no.");
					break;
				} else if (b > b1)
					System.out.println("You guess the Lower no. than value");
				else
					System.out.println("You guess the Higher no. than value");
			}
			if (i == 5)
				System.out.println("The number is " + b);
			break;
		case 2:
			 b = r.nextInt(50);
			for (i = 0; i < 5; i++) {
				System.out.println("Guess the no.");
				b1 = s.nextInt();
				if (b == b1) {
					System.out.println("Congrats you guess the no.");
					break;
				} else if (b > b1)
					System.out.println("You guess the Lower no. than value");
				else
					System.out.println("You guess the Higher no. than value");
			}
			if (i == 5)
				System.out.println("The number is " + b);
			break;
		case 3:
			b = r.nextInt(100);
			for (i = 0; i < 5; i++) {
				System.out.println("Guess the no.");
				b1 = s.nextInt();
				if (b == b1) {
					System.out.println("Congrats you guess the no.");
					break;
				} else if (b > b1)
					System.out.println("You guess the Lower no. than value");
				else
					System.out.println("You guess the Higher no. than value");
			}
			if (i == 5)
				System.out.println("The number is " + b);
			break;
			default:
				game();

		}
	}

	public static void main(String[] args) {
		System.out.println("         Welcome to Number Guessing Game         ");
		System.out.println("		Rules of Game \n	There are 5 chance to guess the no.");
		game();
		while (true) {
			System.out.println("Enter 1 to continue game or enter any key to exit game");
			int a = s.nextInt();
			if (a == 1)
				game();
			else {
				System.out.println("Thanks for using !");
				System.exit(0);
			}

		}

	}
}