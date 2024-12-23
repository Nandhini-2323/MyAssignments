package homeAssignment;

import java.util.Arrays;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="changeme";
		char[] characterInput = input.toCharArray();
		//System.out.println(characterInput[3]);
		int length = characterInput.length;
		//System.out.println(length);
		for(int i=0; i<=length; i++)
		{
			if(i%2 != 0)
			{
				characterInput[i]=Character.toUpperCase(characterInput[i]);
				
			}
		}
		String result = new String(characterInput);
		
		System.out.println("The given string is "+input +" and the changed string is " +result);
	}   

}
