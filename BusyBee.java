/*
 * BUSY BEE
 * Busy Bee is busy with her life and wants you to solve one problem for her.
 * The problem is as follows: You are given an array ‘A’ of size ‘N’ consisting of integers.
 * You have to find the number of points (A[i], A[j]) and ‘i’ < ‘j’.
 * Such that their average is greater than or equal to ‘K’.
 * Input: 4 5 1 3 4 3 Output: (5, 1) (5, 3) (5, 4) (3, 4)
 */

import java.util.Scanner;

public class BusyBee {
    public static void countPairsWithAvgGEK(int[] A, int N, int K) {
        System.out.println("Pairs with average >= " + K + ":");
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if ((A[i] + A[j]) / 2.0 >= K) {
                    System.out.println("(" + A[i] + ", " + A[j] + ")");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array (N): ");
        int N = scanner.nextInt();
        
        int[] A = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();
        
        countPairsWithAvgGEK(A, N, K);
        
        scanner.close();
    }
}