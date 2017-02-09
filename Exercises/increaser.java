import java.util.Scanner;

/* This program increase the value of a number entered from the keyboard (of +1 up to +10)
*  and print at screen all individual increments. */

public class Increaser {
	public static void main(String[] args) {
		int value;
		int valueIncreased;
		
		System.out.println("Enter the value to be incremented:");
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		value = keyboard.nextInt();
		
		System.out.println("The value added to increase is: " + value);
		System.out.println("Here are the increased series:");
		
		valueIncreased = value + 10;
		
		while (value <= valueIncreased) {
			System.out.println(value++);
		}
	}
}
