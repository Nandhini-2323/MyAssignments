package week4.day1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "PayPal India";
		
		//Convert it into a character array
		char[] ipArray = input.toCharArray();
		
		//Declare a Set as charSet for Character
		Set<Character> charSet = new HashSet<>();
		
		//Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new HashSet<>();
		
		//Iterate character array 
		for(int i=0; i<ipArray.length; i++) {
			char a = ipArray[i];
			
			//checking for duplicate characters using if condition
			if(charSet.contains(a)) {
				dupCharSet.add(a);
			}else {
				charSet.add(a);
			}
		}
		
		for(char a : dupCharSet) {
			if(charSet.contains(a)) {
				charSet.remove(a);
				
			}
		}
		charSet.remove(' ');
		System.out.println(charSet);
		System.out.println(dupCharSet);
		
	}

}
