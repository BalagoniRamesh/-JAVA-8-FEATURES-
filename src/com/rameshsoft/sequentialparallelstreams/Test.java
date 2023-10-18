package com.rameshsoft.sequentialparallelstreams;
//Sequential & parallel Streams integer data
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		numbers.stream()    //sequential stream print the data in sequential
		       .forEach(System.out::print);
		
		System.out.println("*****");
		
		numbers.parallelStream()  //parallel stream print the data in parallel manner because multiple core running
				.forEach(System.out::print);
		
		//collect data 
		System.out.println("*****");
		long start = System.currentTimeMillis();
		List<Integer> even =  numbers.stream()
				       .filter(num -> num%2 ==0)
				       .collect(Collectors.toList());
		long end = System.currentTimeMillis();
		System.out.println("Sequential stream time..."+(end-start));
		
		long sstart = System.currentTimeMillis();
		List<Integer> evendata =  numbers.parallelStream()
				       .filter(num -> num%2 ==0)
				       .collect(Collectors.toList());
		long eend = System.currentTimeMillis();
		System.out.println("Parallel stream time..."+(eend-sstart));
		
	}

}
