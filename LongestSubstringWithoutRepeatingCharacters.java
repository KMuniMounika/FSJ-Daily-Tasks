/*
 * Window sliding technique:
Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without duplicate characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:
•	0 <= s.length <= 5 * 104
•	s consists of English letters, digits, symbols and spaces.

 *
 */

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters{
        public static void main(String[] args) {
            String s="bbbbb";
            int len=LongestSub(s);
            System.out.println(len);
        }
        private static int LongestSub(String s) {
        HashSet<Character> hs= new HashSet<Character>();
        int i=0,res=0;
        for(int j=0;j<s.length();j++){
            while(hs.contains(s.charAt(j)))
            {
                hs.remove(s.charAt((i)));
                i++;
            }
            hs.add(s.charAt(j));
            res=Math.max(res, j-i+1);
        }
        return res;
    }
}

// o/p: 1