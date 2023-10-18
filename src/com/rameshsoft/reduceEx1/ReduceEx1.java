package com.rameshsoft.reduceEx1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReduceEx1 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(2,6,7,4,3);
		//lambda expression list of int no's with reduce()
		int result = numbers.stream()
			   .reduce((x,y) -> x+y)
			   .get();
		System.out.println("sum of digits using Lambda... "+result);
		  //method reference list of int no's with reduce()
		numbers.stream()
				.reduce(Integer::sum)
				.ifPresent(System.out::println);
		
		numbers.stream()
		    .reduce(Integer::min)			
			.ifPresent(System.out::println);
		
		numbers.stream()
		     .reduce(Integer::max)
			 .ifPresent(System.out::println);
		//method reference list of String value's with reduce()
		List<String> names = List.of("hotstar", "netflix","youtube","soialmedia");
			names.stream()
			      .reduce(String::concat)
		          .ifPresent(System.out::println);
		//count not empty string
		List<String> fruits = Arrays.asList("","apple", "", "orange", "", "grapes");
		long count =fruits.stream()
		      //.filter(String::isEmpty)
		      .filter(Predicate.not(String::isEmpty))  //is not Empty method
		      .count();
		System.out.println("Empty strings count: "+count);
		
		//find length of not empty Strings sum
		fruits.stream()
			      //.filter(String::isEmpty)
			      .filter(Predicate.not(String::isEmpty))  //is not Empty method
			      .map(String::length)
			      .reduce(Integer::sum)
				  .ifPresent(System.out::println);
				
	}

}
