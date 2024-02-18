package AdvanceJava_EmptyStringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonEmptyStrings {
	public static void main(String[] args) {
		List<String> listString = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		
		List<String> nonEmptyString = new ArrayList<>();
		
		for(String str : listString) {
			if(!str.isEmpty()) {
				nonEmptyString.add(str);
			}
		}
		System.out.println("Non Empty strings are :"+nonEmptyString);	
	}

}
