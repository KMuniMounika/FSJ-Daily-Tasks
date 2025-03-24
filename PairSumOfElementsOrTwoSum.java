import java.util.ArrayList;
import java.util.HashSet;

public class PairSumOfElementsOrTwoSum {
    public static void main(String[] args) {
	int arr[]= {1,4,9,8,25,5,12};
    int n=13;
    ArrayList<Integer> l=new ArrayList<Integer>();
    for(int i=0;i<arr.length;i++){
        int target=n-arr[i];
	    if(l.contains(target))
	    {
		    System.out.println(arr[i]+ " "+target);
	    }
	    l.add(arr[i]);
    }
	}
}

// o/P:
// 9 4
// 5 8
// 12 1



/*
import java.util.HashSet;

public class PairSumOfElementsOrTwoSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 9, 8, 25, 5, 12};
        int n = 13;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int target = n - arr[i];
            if (set.contains(target)) {
                System.out.println(arr[i] + " " + target);
            }
            set.add(arr[i]);
        }
    }
}

*/

// o/p:3
// 1
// 3