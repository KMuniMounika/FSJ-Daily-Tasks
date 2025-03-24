/*
 * ANGRY BIRDS There is a long wire along a straight line, 
 * which contains N bird nests at positions x1, x2, x3, ...xN. 
 * There are B (B <= N) birds, which becomes angry towards each 
 * other once put into a nest. To put the birds from hurting each 
 * other you want to assign birds to nests such that minimum distance 
 * between any two birds as large as possible. Find the largest 
 * minimum distance?I nput: 5 1 2 4 8 9 3 Output: 3
 */

import java.util.Arrays;
import java.util.Scanner;

public class AngryBirds {
    public static boolean canPlaceBirds(int[] nests, int B, int minDist) {
        int count = 1, lastPlaced = nests[0];
        
        for (int i = 1; i < nests.length; i++) {
            if (nests[i] - lastPlaced >= minDist) {
                count++;
                lastPlaced = nests[i];
                if (count == B) return true;
            }
        }
        return false;
    }
    
    public static int largestMinimumDistance(int[] nests, int N, int B) {
        Arrays.sort(nests);
        
        int left = 1, right = nests[N - 1] - nests[0], best = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPlaceBirds(nests, B, mid)) {
                best = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return best;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of nests (N): ");
        int N = scanner.nextInt();
        
        int[] nests = new int[N];
        System.out.println("Enter the positions of the nests: ");
        for (int i = 0; i < N; i++) {
            nests[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number of birds (B): ");
        int B = scanner.nextInt();
        
        int result = largestMinimumDistance(nests, N, B);
        System.out.println("Largest minimum distance: " + result);
        
        scanner.close();
    }
}