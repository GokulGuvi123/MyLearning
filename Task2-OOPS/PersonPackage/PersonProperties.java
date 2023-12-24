package PersonPackage;

public class PersonProperties {
	public static void main(String[] args) {
		Person p1 = new Person("Virat", 30);
		p1.displayInfo();
		Person p2 = new Person("Raghul", 20);
		p2.displayInfo();
		
		//Crating a Person object with default age
		Person p3 = new Person("Hardik");
		p3.displayInfo();
	}

}
