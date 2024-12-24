package homeAssignment;

public class RemoveDuplicateWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Storing a string 
		String text = "We learn Java basics as part of java sessions in java week1";
		
		// spliting the words using " " as delimiter 
		String[] inputArray = text.split(" ");
		int count = 0;
		
		//for loop to find duplicate words
		for(int i=0; i<inputArray.length; i++) {
			for(int j=i+1; j<inputArray.length; j++) {
			if(inputArray[i].equals(inputArray[j])) {
				
				inputArray[j]=" ";
				inputArray[i]=" ";
				count=count+1;
				
			}
			
		}	
			
	}
		
		//if(count>1) {
			for(int i =0; i<inputArray.length; i++ )
			{
				System.out.print(inputArray[i] + " ");
			}
			
}}
