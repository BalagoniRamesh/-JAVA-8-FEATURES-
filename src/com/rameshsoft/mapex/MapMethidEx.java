package com.rameshsoft.mapex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethidEx {

	public static void main(String[] args) {
		
		List<Emp> emps = Arrays.asList(new Emp(101, "ramesh", 10000.45),
										new Emp(102, "anu", 20000.45),
										new Emp(103, "sravya", 30000.45),
										new Emp(104, "chandu", 40000.45));
		//case-1: particular/specific property you will get the values
		emps.stream()
		.map(emp -> emp.getEname()+ " Hyderabad")  //adding
		.forEach(name -> System.out.println(name)); //printing
		
		System.out.println("************");
		//case-2: return complete object format, just printing
		//filter >25000:: every emp sal+1000 :: print the emp		
		emps.stream()
			.filter(emp -> emp.getEsal()>25000) //condition
			.map(emp -> { emp.setEsal(emp.getEsal()+1000); return emp; }) //adding
			.forEach(emp -> System.out.println(emp)); //direct printing
		
		//case-3:   collecting the data & printing
		System.out.println("************");
		List<Emp> listEmps = emps.stream()
			.filter(emp -> emp.getEsal()<25000)
			.map(emp -> {emp.setEname(emp.getEname()+" Hydeabad"); return emp;}) //setting name & return emp object
			.collect(Collectors.toList());  //collecting list employees format
		listEmps.forEach(emp -> System.out.println(emp));
			
	}

}
