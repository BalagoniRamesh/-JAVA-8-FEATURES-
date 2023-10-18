package com.rameshsoft.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ramesh","kavya", "anu", "chandu");
		names.forEach((name) -> System.out.println(name));
		
		List<Integer> numbers = Arrays.asList(10,4,5,67,34);
		numbers.forEach(( num ) -> System.out.println(num));
		List<Emp> emps =Arrays.asList(new Emp(101, "ramesh", 100.34),
				                       new Emp(12, "rani", 2000.01),
				                       new Emp(13, "sravya", 30000.03));
		emps.forEach((emp) -> System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
		
		Set<String> colors =Set.of("red", "orange", "pink", "voilet");
		colors.forEach(color -> System.out.println(color));
		
		Map<String, Integer> wordCount = Map.of("ramesh",5, "is", 10, "great",100);
		wordCount.forEach((k,v) ->System.out.println("Key..."+k+" Value.."+v));
		
		Map<Integer, Emp> mapemps = Map.of(1, new Emp(201, "java", 1000.45),
										2, new Emp(202, "spring", 2000.45),
										3, new Emp(203, "micrs-servives", 3000.45));
		mapemps.forEach( (k,v)-> System.out.println(k+"---"+v.eid+" "+v.ename+" "+v.esal));
				
	}
}
