/*
 * Chocolate Distribution Problem Given an integer array arr of size n, 
where each element represents the number of chocolates a person receives, 
determine the minimum difference between the chocolates distributed to the
person receiving the most chocolates and the one receiving the least. 
Your task is to return the smallest possible difference after distributing 
the chocolates such that the difference between the chocolates of any two 
people is minimized Example: Input: n: 5 arr: 10, 4, 12, 3, 1 m=3 Output: 3


 */

import java.util.Arrays;

public class ChocolateDistribution {
    public static int findMinDifference(int[] arr, int n, int m) {
        // Edge case: If there are no chocolates or students
        if (m == 0 || n == 0) {
            return 0;
        }

        // Sort the array to bring closer numbers together
        Arrays.sort(arr);

        // Minimum difference initialized to a large value
        int minDiff = Integer.MAX_VALUE;

        // Find the subset of 'm' chocolates with the smallest difference
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 12, 3, 1};
        int n = arr.length;
        int m = 3; // Number of students

        int result = findMinDifference(arr, n, m);
        System.out.println("Minimum difference: " + result);
    }
}


// o/p:Minimum difference: 3