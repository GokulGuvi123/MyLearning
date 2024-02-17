package VoterManagement;

import java.util.Scanner;

public class VoterApp {
	public static void main(String[] args) throws InvalidAgeException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Voters");
		int n = scanner.nextInt();
		scanner.nextLine();//Consume new line
		Voter[] voter = new Voter[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Voter ID");
			String VoterID = scanner.nextLine();
			
			System.out.println("Enter Voter age");
			int VoterAge = scanner.nextInt();
			scanner.nextLine();//Consume new line
			
			System.out.println("Enter Voter Name");
			String VoterName = scanner.nextLine();
			voter[i] = new Voter(VoterID,VoterAge,VoterName);
		}
		scanner.close();
		System.out.println("\nVoters details");
		for(Voter vote: voter) {
			System.out.println("Voter ID :"+vote.getAge());
			System.out.println("Voter Age :"+vote.getAge());
			System.out.println("Voter Name:"+vote.getName());
			System.out.println();
		}
	}

}
