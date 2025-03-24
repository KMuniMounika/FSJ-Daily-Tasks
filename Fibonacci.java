// Fibonocci using Ds will be solved in two ways. Its about finding the nth number in the fibonocci series.
// 1. Using Recursion
// 2. Using Memorization
// The second is in doc table format.
import java.util.HashMap; 
public class Fibonacci {
    static HashMap<Integer, Long> memo = new HashMap<Integer, Long>();
    private static long fib(int n) { 
        if(n<=1)return n;
        if(memo.containsKey(n)) 
        return memo.get(n);
        long result=fib(n-1)+fib(n-2);
        memo.put(n, result);
        return result;
    }
    public static void main(String[] args) {
        int n=5;
        n=n+1;
        long res=fib(n);
        System.out.println(res);
    }
}



// o/p: 8
// Time Complexity: O(n)