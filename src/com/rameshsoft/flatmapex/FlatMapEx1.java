package com.rameshsoft.flatmapex;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;


public class FlatMapEx1 {

	public static void main(String[] args) {
		//list of list into single set
		List<List<Integer>>  sublist=List.of(List.of(1,2,3,4),
								    List.of(5,6,7,8));
		System.out.println(sublist);
		
		//case-1: convert sublist into single list
		List<Integer> singleList = sublist.stream()
											.flatMap(Collection::stream)
											.collect(Collectors.toList());
		System.out.println(singleList);
		
		//case-2: convert subsets(3-sets) into single set
		Set<Set<Integer>> subset=Set.of(Set.of(1,2,3,4),
			    							Set.of(5,6,7,8),
			    							Set.of(1,3,6,8,9));
		System.out.println(subset);
		
		Set<Integer> set= subset.stream()
		      .flatMap(Collection::stream) //convert two or many subsets into single set
		      .collect(Collectors.toSet());
		System.out.println(set);
		
		//case-3: list of maps into single list of map
	    List<Map<Integer, String>>	lisMaps = List.of(Map.of(1, "aaa",2,"bbb",3,"ccc"),
													  Map.of(11, "aa",22,"bb",33,"cc"),
													  Map.of(111,"aaa",222,"bbb",333,"ccc"));
	    System.out.println(lisMaps);
	    //Map is different, list of multiple entry's into single List, after flatMap() method it will come into single list
	    //List of sub entry's into single entry :Entry set
	    //Entry List
	    List<Entry<Integer, String>> result= lisMaps.stream()
									           .flatMap(data -> data.entrySet().stream())
									           .collect(Collectors.toList()); //when you collect you get list format
        System.out.println(result);	   
		
	}
}
