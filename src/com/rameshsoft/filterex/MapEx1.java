package com.rameshsoft.filterex;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapEx1 {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(78,45,34,80,69);
		marks.stream()
			.map(mark->mark+2)
			.forEach(mark ->System.out.println(mark));
		System.out.println("*********");
		List<String> names = Arrays.asList("ramesh", "sree", "sravya","anu");
		names.stream()
			 .map(name -> name+"soft")
			 .forEach(name -> System.out.println(name));
		

		//3 4 5 8 9 7 filter the even numbers & every element *10	
		//case-1: With duplicates	
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2, 4, 6, 7, 8, 9);
		List<Integer> evenlist = numbers.stream()
										.filter(number -> number % 2 == 0)
								        .map(number -> number*10) 
								        .collect(Collectors.toList());
		System.out.println(evenlist);
		//case-2: With out duplicates						        
		Set<Integer> evenset = numbers.stream()
										.filter(number -> number % 2 == 0) 
								        .map(number -> number*10) 
								        .collect(Collectors.toSet()); 
		System.out.println(evenset);
	}

}
