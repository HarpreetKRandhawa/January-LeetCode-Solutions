/**
Check Array Formation Through Concatenation

You are given an array of distinct integers arr and an array of integer arrays pieces, where the integers in pieces are distinct. Your goal is to form arr by concatenating the arrays in pieces in any order. However, you are not allowed to reorder the integers in each array pieces[i].

Return true if it is possible to form the array arr from pieces. Otherwise, return false.

Example 1:

Input: arr = [85], pieces = [[85]]
Output: true
Example 2:

Input: arr = [15,88], pieces = [[88],[15]]
Output: true
Explanation: Concatenate [15] then [88]

Constraints:

1 <= pieces.length <= arr.length <= 100
sum(pieces[i].length) == arr.length
1 <= pieces[i].length <= arr.length
1 <= arr[i], pieces[i][j] <= 100
The integers in arr are distinct.
The integers in pieces are distinct (i.e., If we flatten pieces in a 1D array, all the integers in this array are distinct).
**/

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int left = 0;
        while(left<arr.length){
            int curr = arr[left];
            int count = 0;
            for(int[] p: pieces){
                if(p[0]==curr){
                    int[] currArray = p;
                    int idx=0;
                    while(idx<currArray.length){
                        if(arr[left]!=currArray[idx])
                            return false;
                        left++;
                        idx++;
                    }
                    break;
                }
                else
                    count++;
            }
            if(count == pieces.length)
                return false;
        }
        return true;
    }
}

