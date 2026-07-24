import java.util.ArrayList;

class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr; // No carry forward needed, return early
            }
            arr[i] = 0; // If digit is 9, it becomes 0
        }
        
        // If the loop finished, all digits were 9 (e.g., 999 -> 1000)
        int[] newArr = new int[n + 1];
        newArr[0] = 1; // Remaining elements default to 0
        return newArr;
    }
}
