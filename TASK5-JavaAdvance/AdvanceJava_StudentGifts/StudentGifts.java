package AdvanceJava_StudentGifts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGifts {
	public static void main(String[] args) {
		List<String> studentNames = Arrays.asList("Anirudh","Andavar","Antony","Amar","David","Vijay","Ajit","Ashok","Peter","Deva");
		
		List<String> studentWithGift = studentNames.stream()
				                       .filter(name->name.startsWith("A"))
				                       .collect(Collectors.toList());
		
		System.out.println("Students who recieved gitfs are");
		studentWithGift.forEach(System.out::println);
	}

}
