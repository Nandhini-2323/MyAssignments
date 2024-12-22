package stringReverse;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "String companyName= TestLeaf";// The given string to be reversed
		String expectedOutput = "faeLtseT =emaNynapmoc gnirtS";
		String output ="";
	
		System.out.println(input.charAt(input.length()-1));// to print the last character of given string
		char[] eachChar = input.toCharArray(); //convert string to array
		for(int i= eachChar.length-1; i>=0; i-- ) {
			output=output+eachChar[i]; //here output is added with each character being reversed
			
		}
		System.out.println(output);
		if(output.equals(expectedOutput)) {
			System.out.println("The expected output is verified");
		}else {
			System.out.println("The expected output is not verified");
		}
		

	}

}
