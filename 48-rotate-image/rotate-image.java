import java.util.Arrays;

class Solution { 
    public void rotate(int[][] arr) { 
        int len = arr.length; 
        
        // Step 1: Transpose the matrix (swap rows and columns)
        for (int i = 0; i < len; i++) { 
            for (int j = i + 1; j < len; j++) { 
                int temp = arr[i][j];
                arr[i][j] = arr[j][i]; 
                arr[j][i] = temp;
            } 
        } 
        
        // Step 2: Reverse each row to achieve 90-degree clockwise rotation
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][len - 1 - j];
                arr[i][len - 1 - j] = temp;
            }
        }
        
        // Print the final rotated matrix
        for (int[] row : arr) { 
            System.out.println(Arrays.toString(row)); 
        } 
    } 
}
