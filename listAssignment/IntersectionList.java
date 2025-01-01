package listAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer array1[]= {3,2,11,4,6,7};
		Integer array2[]= {1,2,8,4,9,7};
		
		//adding array to List
		List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
		
		//compare the elements in list1 and list2
		for(int i=0; i<list1.size(); i++) {
			for(int j=0; j<list2.size(); j++) {
				if(list1.get(i)==list2.get(j)) {
					System.out.println("The intersecting element in the list are "+list1.get(i));
				}
			}
		}
		
		

	}

}
