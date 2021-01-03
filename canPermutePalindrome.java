/**
Palindrome Permutation

Given a string, determine if a permutation of the string could form a palindrome.

Example 1:

Input: "code"
Output: false
Example 2:

Input: "aab"
Output: true
**/
class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] arr = new int[128];
        for(char w: s.toCharArray())
            arr[(int)w]++;
        
        int count = 0;
        for(int i=0; i<128; i++)
            if(arr[i]%2 != 0)
                count++;
        
        if(count>1)
            return false;
        return true;
    }
}
