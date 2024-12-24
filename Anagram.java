package homeAssignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assigning the inputs
		String text1 = "stops";
		String text2 = "potss";
		
		//obtaining length of the strings
		int length1 = text1.length();
		int length2 = text2.length();
		
		// checking whether the length os the strings are equal
		if(length1==length2) {
			//converting the string to character array
			char CharAr1[] = text1.toCharArray();
			char CharAr2[] = text2.toCharArray();
			
			//sorting the arrays
			Arrays.sort(CharAr1);
			Arrays.sort(CharAr2);
			
			//printing the sorted strings
			System.out.println(CharAr1);
			System.out.println(CharAr2);
			
			//checking whether the given string are equal after sorting
			boolean result = Arrays.equals(CharAr1,CharAr2);
			if(result) {
				System.out.println("The given strings are Anagram");
			}
			else {
				System.out.println("The given strings are not Anagram");
			}
		}else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
				
	}

}
