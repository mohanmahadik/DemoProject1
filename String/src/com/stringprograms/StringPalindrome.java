package com.stringprograms;

public class StringPalindrome {

	public static void main(String[] args) {
	
		        String str = "madam"; // Example input
		        boolean isPalindrome = true;

		        // Convert the string to lowercase to make the palindrome check case-insensitive
		        str = str.toLowerCase();

		        // Compare characters from the beginning and end
		        for (int i = 0; i < str.length() / 2; i++) {
		            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
		                isPalindrome = false;
		                break; // No need to check further if one mismatch is found
		            }
		        }

		        if (isPalindrome) {
		            System.out.println(str + " is a palindrome.");
		        } else {
		            System.out.println(str + " is not a palindrome.");
		        }
		    
		


	}

}
