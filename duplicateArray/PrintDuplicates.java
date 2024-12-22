package duplicateArray;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,3,4,5,1,2,5,8};
		Arrays.sort(num);
		
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println("The duplicate value is "+num[i]);
					break;
				}
		}
	}
}}
			
			