// Balanced gates or Water Resorvoir Problem Or BalancedParentheses - All are same 



/*
// Approach -1
public class BalanceGatesDesignOrWaterResorvoir {

	public static void main(String[] args) {
String s=")))(((";
int c=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)=='(')
		c++;
	else
		c--;
	if(c==-1)
		break;
}

if(c==0)
	System.out.println("Balance gates");
else
	System.out.println("Not Balance gates");	
	}
}

// o/p:Not Balance gates
// Time o(n)
// Space 0(1)
*/


// Approach -2
import java.util.Stack;

// public class BalanceGatesDesignOrWaterResorvoir{
public class BalanceGatesDesignOrWaterResorvoir {
    public static void main(String[] args) {
        String s = ")))(((";  // Example input

        if (isBalanced(s)) {
            System.out.println("Balanced gates");
        } else {
            System.out.println("Not Balanced gates");
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);  // Push opening bracket
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; // More ')' than '('
                }
                stack.pop();  // Pop matching '('
            }
        }
        return stack.isEmpty(); // If empty, it is balanced
    }
}

// Time o(n)
// Space o(n)
