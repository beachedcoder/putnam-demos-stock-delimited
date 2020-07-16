package com.putnam.demo.files_demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemos {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> oddSquares = 
		      numbers.stream()
			.filter(n->{
				System.out.println("filtering " + n);
				return n % 2 != 0; 
			    })
			.map(n->{
				System.out.println("mapping " + n);
				return n*n;
			    })
			.limit(4)
			.collect(Collectors.toList());

		oddSquares.forEach(System.out::println);

	}

}
