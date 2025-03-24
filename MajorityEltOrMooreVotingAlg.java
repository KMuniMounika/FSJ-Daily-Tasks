/*
 *  Majority Element
Easy
Topics
Companies
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:
•	n == nums.length
•	1 <= n <= 5 * 104
•	-109 <= nums[i] <= 109
Follow-up: Could you solve the problem in linear time and in O(1) space?
Moore voting algorithm.
 */

public class MajorityEltOrMooreVotingAlg {

	public static void main(String[] args) {

		int arr[]= {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5,1,1,1,1,1};
		int n=arr.length;
		System.out.println(n);
		
		int result=findMajority(arr);
		if(result!=-1)
			System.out.println(result);
		else
			System.out.println("No majority element");
		
	}

    private static int findMajority(int[] arr) {	
		int candidate=findCandidate(arr);
		return isMajority(arr,candidate)?candidate:-1;
		}

	private static boolean isMajority(int[] arr, int candidate) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(candidate==arr[i])
				count++;
		}
		
		return (count>(arr.length/2));
	}

	private static int findCandidate(int[] arr) {
		int count=0,candidate=0;
		for(int i=0;i<arr.length;i++)
		{
			if(count==0)
				candidate=arr[i];
			if(arr[i]==candidate)
				count++;
			else
				count--;
		}	
		return candidate;
	}
}

// o/p: 21
// No majority element

