package week3.day1;

public class FindOddNumbers{

	public void oddNumber(int maxrange) {
		
	
	
	for(int i=0; i<=maxrange; i++) {
		if(i%2 != 0)
		{
			System.out.println("The number "+i+ "is odd");
		}
	}
		
	}


public static void main(String args[]) {
	FindOddNumbers odd = new FindOddNumbers();
	odd.oddNumber(10);
}}