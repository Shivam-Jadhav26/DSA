class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] brr = new int[len];
        
        
        brr[0] = 1; 
        for (int i = 1; i < len; i++) {
            brr[i] = brr[i - 1] * nums[i - 1];
        }
        
        int rightProduct = 1;
        for (int i = len - 1; i >= 0; i--) {
            brr[i] = brr[i] * rightProduct;
            rightProduct *= nums[i];
        }
        
        return brr;
    }
}
