package week4.day1;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "nandhini";
		char[] inputArray=input.toCharArray();
		
		
		Set<Character> inputset = new HashSet<>();
		for(char a : inputArray) {
			inputset.add(a);
		}

		
		
		System.out.println(inputset);
	}

}
