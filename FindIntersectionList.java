package week3.Day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		int[] arrList1= {3,2,11,4,6,7};
		int[] arrList2= {1,2,8,4,9,7};
		List<Integer> lst1=new ArrayList<Integer>();
		for (int i : arrList1) {
			lst1.add(i);			
		}
		System.out.println("List 1 is Here : " +lst1);
		List<Integer> lst2=new ArrayList<Integer>();
		for (int j : arrList2) {
			lst2.add(j);
		}
		System.out.println("List 2 is Here : " +lst2);
		//common element keyword ---retainall
		//uncommon element keyword---removeall
		lst2.retainAll(lst1);
		System.out.println("The intersected elements are : " +lst2);
		
		
		
		
		
		
	}
//	List<Integer> Set1=new ArrayList<Integer>();
//		Set1.add(3);
//		Set1.add(2);
//		Set1.add(11);
//		Set1.add(4);
//		Set1.add(6);
//		Set1.add(7);
//		System.out.println(Set1);
//		int Size1=Set1.size();
//	List<Integer> Set2=new ArrayList<Integer>();
//		Set2.add(1);
//		Set2.add(2);
//		Set2.add(8);
//		Set2.add(4);
//		Set2.add(9);
//		Set2.add(7);
//		System.out.println(Set2);
//		int Size2=Set2.size();
//		for (int i = 0; i < Size1; i++) {
//			for (int j = 0; j < Size2; j++) {
//				if(Set1[i].equals(Set2[j])); 
//				{
//				System.out.println("The intersected element is "+Set1[i]);
//				}
//			}
//	}
//
//}
	}

//Declare An array for {3,2,11,4,6,7};	 
//* b) Declare another array for {1,2,8,4,9,7};
//* c) Declare for loop iterator from 0 to array length
//* d) Declare a nested for another array from 0 to array length
//* e) Compare Both the arrays using a condition statement
//
//*  f) Print the first array (shoud match item in both arrays)