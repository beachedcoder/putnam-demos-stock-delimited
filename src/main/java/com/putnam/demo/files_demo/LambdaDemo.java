package com.putnam.demo.files_demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.putnam.demo.files_demo.domain.Stock;


public class LambdaDemo {
	
	

	public static void main(String[] args) {
		
		List<String> currencies = 
			    Arrays.asList("USD", "JPY", "EUR", "HKD", "INR", "AUD");
		
		

		currencies.forEach(item -> System.out.println("item in currencies>"+item));
		
		System.out.println("\n\n\n");	
		
		Collections.sort(currencies, (a, b) -> { return a.compareTo(b);});

		currencies.forEach(item -> System.out.println("Sorted item value> " + item));
		
		System.out.println("\n\n\n");
				
		Collections.sort(currencies, (String a, String b) -> { return b.compareTo(a);});

		for (String item : currencies) {
			System.out.println("Sorted item value> " + item);
		}	
		
		currencies.forEach(System.out::println);
		

	}

}
