import java.util.Scanner;

public class Recursive_Catalan {
	public static long catalan(int n) {
        int res = 0;
        // Base case
        if (n <= 0) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if (num<=0)
			System.out.println("0");
		else
		{
		for(int i=0;i<num;i++)
		{
			long catlanNo=catalan(i);
			System.out.print(catlanNo+" ");
		}
		}
	}

}


// o/p:5
// 1 1 2 5 14 