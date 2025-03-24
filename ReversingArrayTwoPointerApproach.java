// By using import java.util.Arrays;

public class ReversingArrayTwoPointerApproach {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 * o/p:6 5 4 3 2 1
 * Time Complexity:o(n)
 */