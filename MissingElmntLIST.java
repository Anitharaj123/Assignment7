package week3.Day2;

import java.util.ArrayList;

import java.util.List;

public class MissingElmntLIST {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> arrList=new ArrayList<Integer>();
		for (int i : arr) {
			arrList.add(i);	
		}
		System.out.println("The List is : "+arrList);
		for (int j = 1; j < arrList.size(); j++) {
		
		if(!arrList.contains(j)) {
			System.out.println("The Missing Element in a List is : "+j);
			
		//
				}
				
			}
			
			
		}
}
//Here is the input
		//int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration