/*
In this section, we will learn what is a Catalan number and also create Java programs to check if the given number is a Catalan number or not.
The Catalan number program is frequently asked in Java coding interviews and academics.
There are many interesting problems that can be solved using the Catalan number.
Mathematically, the Catalan numbers are defined as,

Steps to Find the Catalan Numbers
Step 1: Assign a non-negative integer to the variable n.
Step 2: Find the value of 2nCn, where n is determined in step 1.
Step 3: Divide the value found in step 2 by n+1. The resultant that we get after the division is a Catalan number.
*/
// Tabulation method.


import java.util.ArrayList;
import java.util.HashMap;

public class CatalanUsingTabulationMethod {
	public static void main(String[] args) {
		
		int n=10;
		ArrayList<Integer> c= new ArrayList<Integer>();
		c.add(1);
		for(int i=1;i<=n;i++)
		{
		    c.add(catalanfunc(c,i));
		}
		System.out.println(c);
        }

        private static Integer catalanfunc(ArrayList<Integer> c, int z) {
            
            
            int cat=0;
            for(int i=0;i<z;i++)
            {
                cat=cat+c.get(i)*c.get(z-i-1);
            }
            
                    
            return cat;
        }
    }
    


//    o/p: [1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796]