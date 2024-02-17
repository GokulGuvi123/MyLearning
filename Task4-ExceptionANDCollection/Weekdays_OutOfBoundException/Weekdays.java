package Weekdays_OutOfBoundException;

import java.util.Scanner;

public class Weekdays {
	public static void main(String[] args) {
		String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day position(0-6)");
		int dayPos = scanner.nextInt();

		try {
			String dayName = weekDays[dayPos];
			System.out.println("The day at position " + dayPos + " is: " + dayName);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Day index is outside the range (0-6)");
		}
		scanner.close();
	}
}
