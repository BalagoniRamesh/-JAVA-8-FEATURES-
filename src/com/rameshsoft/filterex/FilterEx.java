package com.rameshsoft.filterex;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterEx {

	public static void main(String[] args) {
		List<Emp> emps =Arrays.asList(new Emp(10, "ramesh", 10000.45),
				                      new Emp(11, "anu", 20000.45),
				                      new Emp(12, "aruna", 30000.45),
				                      new Emp(13, "sravya", 40000.45));
	System.out.println("***Filter the emp data print the data***");
	emps.stream()
		.filter(emp->emp.ename.startsWith("r"))
		.forEach(emp ->	System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
	
	System.out.println("****Filter the data collect the data in List format***");
	List<Emp> el = emps.stream()
						.filter(emp -> emp.esal>15000)
						.collect(Collectors.toList());
	el.forEach(emp ->System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
	
	System.out.println("****Filter the data collect the data in Set format***");
	Set<Emp> es = emps.stream()
			.filter(emp -> emp.esal>15000)
			.collect(Collectors.toSet());
	es.forEach(emp ->System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
	
	System.out.println("****Filter the emp data findFirst element***");
	Emp e = emps.stream()
			.filter(emp -> emp.esal>15000)
			.findFirst()
			.get();
	System.out.println(e.eid+" "+e.ename+" "+e.esal);
	
	System.out.println("****Filter the emp data findFirst element or Else null***");
	Emp ee = emps.stream()
			.filter(emp -> emp.esal>150000)
			.findFirst()
			.orElse(null);
	if(ee == null)
		System.out.println(ee);
	else
		System.out.println(ee.eid+" "+ee.ename+" "+ee.esal);
	
	System.out.println("********Filter the emp data get specific element*******");
	Emp eee = emps.stream()
					.filter(emp -> emp.esal>15000)
					.skip(2)
					.findFirst()
					.get();
	System.out.println(eee.eid+" "+eee.ename+" "+eee.esal);
	}	
}
