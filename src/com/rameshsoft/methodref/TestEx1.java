package com.rameshsoft.methodref;

import java.util.List;

public class TestEx1 {

	public static void main(String[] args) {
		List<String> names = List.of("Charan", "Mokshith", "Praksah", "Ganesh");
		names.forEach(name -> System.out.println(name));   //lambda expression
		System.out.println("***method reference() code***");
		names.forEach(System.out::println);
		
		List<Emp> emps = List.of(new Emp(101, "devi", 10000.45),
								 new Emp(102, "anusha", 20000.45),
								 new Emp(103, "paramesh", 30000.45),
								 new Emp(104, "suman", 40000.45));
		emps.forEach(emp -> System.out.println(emp));  //lambda expression
		
		System.out.println("***method reference()***");
		emps.forEach(System.out::println);
	}

}
