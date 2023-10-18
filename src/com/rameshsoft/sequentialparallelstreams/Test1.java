package com.rameshsoft.sequentialparallelstreams;
//Sequential & parallel Streams using Object data
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Emp> emps =Arrays.asList(new Emp(111, "Ramesh", 1000.45, 25),
				                      new Emp(222, "Anusha", 2000.45, 35),
				                      new Emp(333, "Venu", 3000.45, 45),
				                      new Emp(444, "Pandu", 4000.45, 55));
	long start = System.currentTimeMillis();
	emps.stream()
	    .sorted(Comparator.comparing(Emp::getEname))
	    .forEach(System.out::println);
    long end = System.currentTimeMillis();
    System.out.println("Sequential stream sorting time...."+(end-start));

	
	long sstart = System.currentTimeMillis();
	emps.parallelStream()
	    .sorted(Comparator.comparing(Emp::getEname))
	    .forEach(System.out::println);
    long eend = System.currentTimeMillis();
    System.out.println("Parallel stream sorting time...."+(eend-sstart));
 
    //method reference used to find average of the ages
   double avg = emps.stream()
			        .mapToInt(Emp::getAge)  //all ages map to integer
			        .average()  //average as double format
			        .getAsDouble();
   System.out.println(avg);
	}
}
