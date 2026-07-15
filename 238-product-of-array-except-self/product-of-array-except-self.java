class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] brr = new int[len];
        
        // Step 1: Calculate prefix products and store them in brr
        // brr[i] will contain the product of all elements to the left of i
        brr[0] = 1; 
        for (int i = 1; i < len; i++) {
            brr[i] = brr[i - 1] * nums[i - 1];
        }
        
        // Step 2: Calculate suffix products on the fly and multiply with prefix
        int rightProduct = 1;
        for (int i = len - 1; i >= 0; i--) {
            brr[i] = brr[i] * rightProduct;
            rightProduct *= nums[i];
        }
        
        return brr;
    }
}
