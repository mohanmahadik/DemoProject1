package com.stringprograms;

public class SwapString {

	public static void main(String[] args) {
		
		        // Initial strings
		        String str1 = "Hello";
		        String str2 = "World";

		        System.out.println("Before swapping:");
		        System.out.println("str1: " + str1);
		        System.out.println("str2: " + str2);

		        // Swap strings using concatenation and substring
		        str1 = str1 + str2; // Concatenate str1 and str2
		        str2 = str1.substring(0, str1.length() - str2.length()); // Extract original str1
		        str1 = str1.substring(str2.length()); // Extract original str2

		        System.out.println("\nAfter swapping:");
		        System.out.println("str1: " + str1);
		        System.out.println("str2: " + str2);
		    
		


	}

}
