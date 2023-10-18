package com.rameshsoft.sortingex;

import java.util.Arrays;
import java.util.List;

public class SortEx2 {

	public static void main(String[] args) {
		List<Emp> emps = Arrays.asList(new Emp(56, "ramesh", 10000.56),
										new Emp(23, "anu", 30000.56),
										null,
										new Emp(11, "charan", 80000.56),
										new Emp(18, "mokshith", 20000.56),
										new Emp(34, "paramesh", 40000.56));
		/*
		//case-1: sort the data ; list.sort()
		System.out.println("*****sort the Emp data based on eid*****");
		//emps.sort((e1, e2) -> e1.eid.compareTo(e2.eid));  //ASCII
		//emps.sort((e1, e2) -> -e1.eid.compareTo(e2.eid));  //DESCI
		emps.sort((e1, e2) -> e2.eid.compareTo(e1.eid));  //DESCI
		emps.forEach(emp ->System.out.println(emp));
		
		System.out.println("*****sort the Emp data based on ename*****");
		emps.sort((e1,e2)->e1.ename.compareTo(e2.ename));
		emps.forEach(emp ->System.out.println(emp));
		Note: list.sort() if null values there in object it will not work.
		Note: .stream() if null values there in object it will work.
		*/
		System.out.println("**********");
		//case2: sort the based on stream
		emps.stream()
			.filter(emp -> emp != null)
		    .filter(emp -> emp.esal<=50000)
		    .sorted((e1,e2)-> e1.esal.compareTo(e2.esal))
		    .forEach(emp ->System.out.println(emp));	

	}

}
