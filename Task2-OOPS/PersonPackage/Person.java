package PersonPackage;

public class Person {
	public String name;
	public int age;

	// Constructor to initialize name and age
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name) {
		this.name = name;
		this.age = 18;
	}

	// Method to display name and age of the person
	public void displayInfo() {
		System.out.println("Name :" + this.name + ", Age : " + this.age);
	}

}
