package com.rameshsoft.lambda;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterEx1 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(5, 6, 8, 3, 6, 9, 2, 8);
		System.out.println("*****Filter the even data:: printing*****");
		numbers.stream().filter(i -> i % 2 == 0).forEach(number -> System.out.println(number));

		System.out.println("*****Filter the even data:: collect as list format*****");
		List<Integer> evenlist = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenlist);

		System.out.println("*****Filter the even data:: count the number of elements*****");
		long count = numbers.stream().filter(i -> i % 2 == 0).count();
		System.out.println(count);

		System.out.println("*****Filter the even data:: find the first element*****");
		int num = numbers.stream().filter(i -> i % 2 == 0).findFirst().get();
		System.out.println(num);

		//6, 8, 6, 2, 8
		System.out.println("*****Filter the even data:: get the specific element*****"); 
		int n = numbers.stream() 
				.filter(i -> i%2 == 0) 
				.skip(3)
		 		.findFirst()
		 		.get();
		System.out.println(n);		
	}

}
