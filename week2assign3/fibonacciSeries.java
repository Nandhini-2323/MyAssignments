package week2assign3;

public class fibonacciSeries {
	public static void main(String args[]) {
		int n1=0, n2=1, n3, count=7, i;
		
				System.out.print(n1 +" " +n2+ " ");
				for(i=n2; i<7; i++) {
			
				n3=n1 + n2;
		        System.out.print(" " +n3);
		        n1=n2; 
		        n2=n3;
				}
		        
	
	}
	}		