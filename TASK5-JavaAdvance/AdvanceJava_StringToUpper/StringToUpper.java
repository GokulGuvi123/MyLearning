package AdvanceJava_StringToUpper;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToUpper {
	public static void main(String[] args) {
		Stream<String> streamNames = Stream.of("aBc", "d", "ef");

		List<String> upperCaseList = streamNames
				                      .map(String::toUpperCase)
				                      .collect(Collectors.toList());
		System.out.println("UpperCase List is :"+upperCaseList);
	}

}
