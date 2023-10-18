package com.rameshsoft.reduceex;

import java.util.Arrays;
import java.util.List;

public class ReduceEx {

	public static void main(String[] args) {
		List<Integer> prices = List.of(56, 34, 56, 78, 23, 200, 12);
		int res =  prices.stream()  
				    	  .reduce((i,j) -> i+j)
				    	  .get();
		System.out.println(res);
		List<String> names = Arrays.asList("raju", "rani", "devi", "ramesh", "deyam");
		int result = names.stream()
							.filter(name -> (name.startsWith("r") || name.startsWith("d")) && name.length()==4)
							.map(name -> name+"it")
							.reduce((name1, name2) -> name1+name2) //459
				            .get() //return string   rajuitraniitdeviit
						    .length();  //return length  18
			System.out.println(result);
			//number : filter<10 :: every element multiply *10 :: print the addition of all element
			List<Integer> numbers =Arrays.asList(2,67,4,6,10,10,23,44);
			int total = numbers.stream()
							.filter(number -> number<10)   //20+40+60
							.map(number -> number*10)
							.reduce((num1, num2)-> num1+num2)
							.get();
			System.out.println(total);
            
	}

}
