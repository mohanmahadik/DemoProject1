package com.stringprograms;

public class StringLiteral {

	public static void main(String[] args) {
		
		String str1 = "hi";
		String str2 = "hi";
		String str3 = "pune";
		if(str1 == str3) {
			System.out.println("string constant pool");
		}else {
			System.out.println("Heap area");
		}

	}

}
