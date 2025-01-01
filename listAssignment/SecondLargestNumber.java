package listAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer Array[] = {3,2,11,4,6,7};
		//Array to list
		List<Integer> list = new ArrayList<>(Arrays.asList(Array));
		Collections.sort(list);
		int length = list.size();
		
		System.out.println("The second largest number is  "+list.get(length-2));

	}

}
