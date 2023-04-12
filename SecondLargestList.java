package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestList {

	public static void main(String[] args) {
		   int[] arrSet1= {3,2,11,4,6,7};
		   List<Integer> Set1=new ArrayList<Integer>();
		  for (Integer i : arrSet1) {
			 Set1.add(i);
		}
			System.out.println("The Given List is : "+Set1);
			//toSORT
			 
			Collections.sort(Set1);
			System.out.println("The Sorted List is: "+Set1);
			int SiZe=Set1.size();
			int secndelement=Set1.get(SiZe-2);	
			System.out.println("The Second LArgest NUmber in a List is : "+secndelement);				
			
			}	

	}


