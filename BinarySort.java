/*
 * Problem Description: Sort an Array of 0s and 1s (Binary Sort)
Given an array containing only 0s and 1s, you are tasked with sorting the array so that all the 0s come before all the 1s with minimal swaps.
Problem Constraints:
•	The array contains only two types of elements: 0s and 1s.
•	The array length n satisfies:
1 <= n <= 10^5 (The size of the array can be up to 100,000 elements).
•	The elements of the array are binary: 0 or 1.
Examples:
Example 1:
Input:
arr = [0, 1, 0, 1, 1, 0]
Output:
0 0 0 1 1 1
Explanation:
The 0s come first followed by all the 1s.
Example 2:
Input:
arr = [1, 0, 1, 0, 1]
Output:
0 0 1 1 1
Explanation:
The 0s come first, followed by the 1s, after sorting the array.
Example 3:
Input:
arr = [0, 0, 0, 0, 0]
Output:
0 0 0 0 0
Explanation:
The array is already sorted with all 0s.
Example 4:
Input:
arr = [1, 1, 1, 1, 0, 0]
Output:
0 0 1 1 1 1
Explanation:
The array contains all the 0s before the 1s after sorting
 */

public class BinarySort {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 0, 1, 0 };
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            while (l < r && arr[l] == 0)
                l++;
            while (l < r && arr[r] == 1)
                r--;
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        // Instead of from line:4 - while use "Arrays.sort(arr);""
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// o/p:0 0 0 1 1 1 1
// time o(n) with out sorting



/*
// Another Method with "sort".
public class BinarySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {0,1,1,1,0,1,0};
		int n=arr.length;
		
		Arrays.sort(arr);
		
				for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}


// o(nlogn)
// sc-o(1)
*/