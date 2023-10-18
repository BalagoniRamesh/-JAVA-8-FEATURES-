package com.rameshsoft.methodref;

import java.util.List;
import java.util.stream.Collectors;

public class MethodFilter {

	public static void main(String[] args) {
		List<String> names = List.of("", "ramesh", "anu", "", "sravya", "chandhu");
		
		System.out.println("***case-1: counting the data with lamda expression, filtering purpose***");
		long count = names.stream()
			//.filter(name -> name.isEmpty()) //data won't come:  2
			.filter(name -> !name.isEmpty()) //data will come:  4
			//.forEach(name ->System.out.println(name));
			.count();
		System.out.println(count);  
		
		System.out.println("***case-2: counting the data with method reference, filtering purpose***");			
		long c = names.stream()
					  .filter(String::isEmpty) //method reference with predefined class & predefined method
					  .count();
		System.out.println(c);   
		
		List<Emp> emps = List.of(new Emp(101, "devi", 10000.45),
				 new Emp(102, "anusha", 20000.45),
				 new Emp(103, "paramesh", 30000.45),
				 new Emp(104, "suman", 40000.45));
		
		System.out.println("***case-3: list of employess applying lambda expression, filtering purpose***");	 
		emps.stream()
		    .filter(emp->emp.esal>25000)
		    .forEach(emp -> System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
		//Custom method-1
		System.out.println("***case-4.1:list of employess applying method reference, filtering purpose***");			
		emps.stream()
		    .filter(Emp::salaryCheck)  //filtering Emp of this method salaryCheck
		    .forEach(System.out::println);  //here toString() executed
		
		//Custom method-2
		System.out.println("***case-4.2:list of employess applying method reference, filtering purpose***");			
		 List<Emp> e= emps.stream()
			.filter(Emp::nameCheck)  //filtering Emp of this method nameCheck
			.collect(Collectors.toList());  
		e.forEach(System.out::println);
	}

}
