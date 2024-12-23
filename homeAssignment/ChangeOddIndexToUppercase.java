package homeAssignment;

import java.util.Arrays;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="changeme";
		//converting the given string to character array
		char[] characterInput = input.toCharArray();
		
		int length = characterInput.length;
		
		for(int i=0; i<=length; i++)
		{
			//finding the odd index
			if(i%2 != 0)
			{
				//converting the odd index to uppercase Character class
				//converting for one odd index at a time
				characterInput[i]=Character.toUpperCase(characterInput[i]);
				
			}
		}
		//storing the converted character array to string
		String result = new String(characterInput);
		
		System.out.println("The given string is "+input +" and the changed string is " +result);
	}   

}
