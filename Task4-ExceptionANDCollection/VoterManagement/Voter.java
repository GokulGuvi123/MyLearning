package VoterManagement;

public class Voter {
	String voterID;
	int age;
	String name;

	public Voter(String voterID, int age, String name) throws InvalidAgeException {
		try {
			if (age < 18) {
				throw new InvalidAgeException("Invalid age for voter");
			}
			this.age = age;
			this.name = name;
			this.voterID = voterID;
		} catch (InvalidAgeException e) {
			 System.out.println("Error creating voter: " + e.getMessage());
		}
	}

	public String getVoterID() {
		return voterID;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}
