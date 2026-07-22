class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
        // 1. Find the carry bits where both a and b have 1s
        int carry = a & b; 
        
        // 2. Sum the bits where a and b are different (XOR)
        a = a ^ b; 
        
        // 3. Shift carry to the left to add it to the next higher bit
        b = carry << 1; 
    }
    return a;
    }
}