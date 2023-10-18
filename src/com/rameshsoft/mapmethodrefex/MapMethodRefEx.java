package com.rameshsoft.mapmethodrefex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodRefEx {
	public static List<Integer> stringNumToIntNum(List<String> stringnumbers)  //stringnumbers is a stream object 
	{
		return stringnumbers.stream()
							.map(Integer::valueOf)  
							.collect(Collectors.toList());
	}
	public static List<Integer> stringLength(List<String> names)  //stringnumbers is a stream object 
	{
		return names.stream()
				.map(String::length)
				.collect(Collectors.toList());
	}
	public static List<String> stringUpper(List<String> lowernames)  //stringnumbers is a stream object 
	{
		return lowernames.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());  //collect
	}

	public static void main(String[] args) {
		System.out.println("*** converting string object to integer object");
		List<String> stringnumbers = Arrays.asList("1","2","3","4","5");
		List<Integer> intnumbers = MapMethodRefEx.stringNumToIntNum(stringnumbers);
		System.out.println(intnumbers);
		
		System.out.println("*** string object elements length");
		List<String> names = Arrays.asList("ramesh","anusha","sravani","chandru","purna");
		List<Integer> lengths= MapMethodRefEx.stringLength(names);
		System.out.println(lengths);
		
		System.out.println("*** input is lowercase output uppercase");
		List<String> lowernames = Arrays.asList("ramesh","anusha","sravani","chandru","purna");
		List<String> upperNames= MapMethodRefEx.stringUpper(lowernames);
		System.out.println(upperNames);

		System.out.println("***adding value 2 to age***");
		List<Person> persons = Arrays.asList(new Person("ramesh", 22),
				                             new Person("sravani", 18));
		persons.stream()
		       .map(Person::newAge)
		       .forEach(age ->System.out.println(age));
		

	}

}
