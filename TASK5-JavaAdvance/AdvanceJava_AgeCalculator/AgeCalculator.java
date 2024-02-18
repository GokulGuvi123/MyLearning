package AdvanceJava_AgeCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your birthday(yyyy-mm-dd):");
		String birthday = scanner.nextLine();
		
		LocalDate birthdayinLocal = LocalDate.parse(birthday);
		
		LocalDate currentDate = LocalDate.now();
		
		Period age = Period.between(birthdayinLocal, currentDate);
		
		System.out.println("Your age is "+ age.getYears() + " years, " + age.getMonths() +" months "+ age.getDays() + " days");
		scanner.close();
	}

}
