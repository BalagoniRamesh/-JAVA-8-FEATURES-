package com.rameshsoft.flatmapex;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//flatMap() method Object data, method reference
public class FlatMapEx2 {
	public static void main(String[] args) {
		List<Emp> emps = List.of(
				                 new Emp("Ramesh", List.of(9392523821L,9392523822L)),  //In java by default numeric data is integer, put L will be must
				                 new Emp("Anusha", List.of(9392523823L,9392523824L)) );
	emps.forEach(emp -> System.out.println(emp.getPhones()));  //print code for phone numbers
	//case-1: get List of List all phone numbers
	List<List<Long>> phones = emps.stream()
						    .map(emp -> emp.getPhones())
						    .collect(Collectors.toList());
	System.out.println(phones);
	
	//case-2: list of multiple phone numbers
	List<Long> p= emps.stream()
				      .map(Emp::getPhones)  //get all the phones in single list format
				      .flatMap(Collection::stream)
				      .collect(Collectors.toList());
	System.out.println(p);
	
	//adding +91- to list of multiple phone numbers
	List<String> pp= emps.stream()
		      .map(Emp::getPhones)  //get all the phones in single list format
		      .flatMap(Collection::stream)
		      .map(num -> "+91-"+num)
		      .collect(Collectors.toList());
	System.out.println(pp);	
	
	}

}
