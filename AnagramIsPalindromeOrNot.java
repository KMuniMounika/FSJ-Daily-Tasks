import java.util.Arrays;
import java.util.HashMap;

public class AnagramIsPalindromeOrNot {

	public static void main(String[] args) {
String s="aabbccddef";
String res=canFormPalindrome(s);
System.out.println(res);
	}

	private static String canFormPalindrome(String s) {
		
		HashMap<Character, Integer> charcount= new HashMap<Character, Integer>();
		
		for(char c:s.toCharArray())
		{
			int f=charcount.getOrDefault(c, 0)+1;
			charcount.put(c,f);
		}
		
		System.out.println(charcount);
		
		int oddc=0;
		for(int count:charcount.values())
		{
			if(count%2!=0)
				oddc++;
			if(oddc>1)
				return "No";
		}
		
		return "Yes";
	}
	

}

// {a=2, b=2, c=2, d=2, e=1, f=1}
// No