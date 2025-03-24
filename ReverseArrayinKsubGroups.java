//Reversing an array by divinding into k-Subgroups 
public class ReverseArrayinKsubGroups {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int n = arr.length;
        int k = 3;
        int l;
        int r;
        for (int i = 0; i < n; i = i + k) {
            l = i;
            r = i + k - 1;
            while (l <= r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}

/*
 * o/p:
 * 3
 * 2
 * 1
 * 6
 * 5
 * 4
 * 9
 * 8
 * 7
 * 12
 * 11
 * 10
 */