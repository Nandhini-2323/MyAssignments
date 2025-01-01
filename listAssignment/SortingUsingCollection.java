package listAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arrayText[] =  {"HCL", "Wipro", "Aspire Systems", "CTS"} ;
		
		//array to list
		List<String> name = new ArrayList<>(Arrays.asList(arrayText));
		System.out.println(name);
		Collections.sort(name);
		System.out.println("The sorted list is " +name);
		System.out.println("The reversed string is:");
		int length = name.size();
		for(int i=length-1; i>-1; i--) {
			System.out.print(name.get(i) +", ");
		}
	}

}
