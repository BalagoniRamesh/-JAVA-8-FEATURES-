package com.rameshsoft.sortingex;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEx1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ramesh", "anu", "sravya");
		
		System.out.println("****Approach-1 Collections.sort() method ****");
		Collections.sort(names);  //ASCI
		System.out.println(names);
		
		Collections.sort(names,Comparator.reverseOrder());
		System.out.println(names);
		
	    System.out.println("****Approach-2 list.sort() method ****");
		names.sort((name1, name2) -> name1.compareTo(name2));
		System.out.println(names);
		
		names.sort((name1, name2) -> -name1.compareTo(name2));
		System.out.println(names);
		//compare()  >compare method having two  arguments compare method internally sorting using comapreTo() method 
		//compare() is a method inside that method we are writing logic using compareTo() method
	    System.out.println("****Approach-3 list.sort() method ASSC****");
	    List<String> newnames =Arrays.asList("raju", "rani", "devi", "ratan", "japan");
	    newnames.stream()
	            .sorted()
	            .forEach(name -> System.out.println(name));
	    
	    System.out.println("****Approach-3 list.sort() method DESCI****");
	    newnames.stream()
	            .sorted((name1, name2) -> -name1.compareTo(name2))
	            .forEach(name -> System.out.println(name));
	    
	   System.out.println("***Approach-3 list.sort() method ****");
	   newnames.stream()
	           .filter(name -> name.startsWith("r"))
	           .sorted()
	           .forEach(name -> System.out.println(name));
	}

}
