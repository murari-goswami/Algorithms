package com.lipika.Algorithms;

/*
 * Bubble sort algorithm
 * worst case performance o(n2)
 * Best case performance o(n)
 */

public class BubbleSortAlgoImpl {

	public static void main(String[] args) {
		
		int[] unsortedList = {20,1,12,3,33,87,4};
		
		int sizeOfList = unsortedList.length;
		boolean swapped = true;
		int tempPlace = 0;
		
		while(swapped) {
			swapped =  false;
			for(int i =1;i<sizeOfList;i++) {
				if (unsortedList[i - 1] > unsortedList[i]) {
					tempPlace = unsortedList[i - 1];
					unsortedList[i - 1] = unsortedList[i];
					unsortedList[i] = tempPlace;
					swapped = true;
				}
			}
			
		}
		
		System.out.println("Bubble Sorted List");
		for(int val=0;val<sizeOfList;val++){
			System.out.println(unsortedList[val]);
		}
		
		
	}
}
