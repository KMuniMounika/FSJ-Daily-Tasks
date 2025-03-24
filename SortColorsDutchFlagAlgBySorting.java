/*
 * Problem Description: Sort Colors (Dutch National Flag Problem)
The Dutch National Flag Problem involves sorting an array of 0s, 1s, and 2s in a way that all 0s come first, followed by all 1s, and all 2s come last. The problem can be efficiently solved without using extra space, i.e., in-place sorting, by utilizing a three-pointer technique.
Problem Breakdown:
Given an array consisting of only the values 0, 1, and 2, sort the array so that all 0s are placed at the beginning, followed by all 1s, and finally, all 2s are placed at the end.
Time Complexity:
•	Time Complexity: O(N) — Each element is processed once, and no nested loops are required.
•	Space Complexity: O(1) — The sorting is done in-place.
Constraints:
•	The array only contains 0s, 1s, and 2s.
•	1 <= N <= 10^6 — the size of the array.
•	The values in the array are limited to 0, 1, and 2.
 */

import java.util.Arrays;
public class SortColorsDutchFlagAlgBySorting{
	public static void main(String[] args) {
	int arr[]= {0,1,1,1,0,1,0,2,1,2};
	int n=arr.length;
	Arrays.sort(arr);
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
	}
}


//o/p 0 0 0 1 1 1 1 1 2 2 

// o(nlogn)