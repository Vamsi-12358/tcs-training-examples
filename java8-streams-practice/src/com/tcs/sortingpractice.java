package com.tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class sortingpractice {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(7);
		System.out.println("original list "+list);
		System.out.println("*******************");
		List<Integer> ascList =list.stream().sorted((x,y) -> Integer.compare(x, y)).collect(Collectors.toList());
		System.out.println("sorted list: "+ascList);
		System.out.println("*******************");
		List<Integer> decList =list.stream().sorted((x,y) -> Integer.compare(y, x)).collect(Collectors.toList());
		System.out.println("*******************");
		System.out.println("sorted list: "+decList);
		System.out.println("*******************");
		list.stream().forEach(item -> System.out.println(item));
		System.out.println("------ Producing the dishes with 10% discount -----");
		
	}

}
