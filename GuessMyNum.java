import java.util.Scanner;

public class GuessMyNum	{
	
	public static void main (String[] args)	{

		int guess = 41;
		Scanner scan = new Scanner(System.in);
		System.out.print("Guess My Number from 1-100: ");
		int num = scan.nextInt();
		while (num != guess) {
			System.out.println("Try again: ");
			num = scan.nextInt();
		}
		scan.close();
		System.out.println("Yay! It is " + num);

	}
}