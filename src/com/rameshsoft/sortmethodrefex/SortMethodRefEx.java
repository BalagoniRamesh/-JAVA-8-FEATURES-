package com.rameshsoft.sortmethodrefex;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMethodRefEx {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ramesh", "anusha", "harika jeripothula", "hema");
			//case-1: Coolecton.sort
		//Collections.sort(names);     //Ascending order
		//lambda expression 
		//names.sort((i1, i2) -> i1.compareTo(i2));  //Ascending order
		//method reference
		names.sort(String::compareTo);   //Ascending order
		System.out.println(names);
		
		List<Integer> numbers = Arrays.asList(1,6,4,9,2,7,8);
		numbers.sort(Integer::compareTo);
		System.out.println(numbers);
		
		List<Product> products = Arrays.asList(new Product(101, "watch", 350),
				                              new Product(34, "headset", 200),
				                              new Product(456, "camera", 6000),
				                              new Product(344, "mouse", 125),
				                              new Product(565, "earbuds", 1200));
		//method reference
		System.out.println("*** sort :: id***");
		Collections.sort(products,Comparator.comparingInt(Product::getPid));
		products.forEach(System.out::println);
		
		System.out.println("*** sort :: name***");
		//products.sort(Comparator.comparing(Product::getPname));  //ASCII order
		products.sort(Comparator.comparing(Product::getPname).reversed()); //Descending order
		products.forEach(System.out::println);
		
		System.out.println("*** sort :: cost***");
		products.stream()
		        //.sorted(Comparator.comparing(Product::getPcost)) //ASCII order
		        .sorted(Comparator.comparing(Product::getPcost).reversed()) //Descending order
		        .forEach(System.out::println);  
		
	}
}
