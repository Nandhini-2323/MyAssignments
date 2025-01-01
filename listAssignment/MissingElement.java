package listAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring an array
		Integer array[]=  {1, 2, 3, 4, 10, 6, 8};
		
		//Array to list
		List<Integer> list= new ArrayList<>(Arrays.asList(array));
		//sort the list
		Collections.sort(list);
		System.out.println("The sorted list is "+list);
		for(int i=0; i<list.size(); i++) {
			int a = list.get(i);
			int b=a+1;
			
			if(b==list.get(i+1)) {
				System.out.println("The element is correct "+list.get(i+1));
			}else {
				System.out.println("The missing element is "+b);
			}
				
		}
		
		
	}

}
