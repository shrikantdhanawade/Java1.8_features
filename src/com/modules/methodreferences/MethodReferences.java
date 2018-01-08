package com.modules.methodreferences;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences {
	public static void main(String args[]) {
		List names = new ArrayList();

		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");

		// Method References using :: way and use of forEach method
		// Here we have passed System.out::println method as a static method reference.
		names.forEach(System.out::println);
	}
}
