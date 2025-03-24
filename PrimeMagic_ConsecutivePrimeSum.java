/*
 * PRIME MAGIC Some prime numbers can be expressed as a sum of other consecutive prime numbers.
 * For example 5 = 2 + 3 17 = 2 + 3 + 5 + 7 41 = 2 + 3 + 5 + 7 + 11 + 13.
 * Your task is to find out how many prime numbers which satisfy this property are present in
 * the range 3 to N subject to a constraint that summation should always start with number 2
 * Write code to find out the number of prime numbers that satisfy the above-mentioned property in a given range.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeMagic_ConsecutivePrimeSum {
    
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static int countConsecutivePrimeSums(int N) {
        ArrayList<Integer> primes = new ArrayList<>();
        int sum = 0, count = 0;
        
        for (int i = 2; sum + i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                primes.add(sum);
            }
        }
        
        for (int primeSum : primes) {
            if (primeSum >= 3 && primeSum <= N && isPrime(primeSum)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        int result = countConsecutivePrimeSums(N);
        System.out.println("Number of prime numbers that can be expressed as a sum of consecutive primes: " + result);
        
        scanner.close();
    }
}