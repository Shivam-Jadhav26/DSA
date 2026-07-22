class Solution {
    public int missingNumber(int[] nums) {
        int num = -1; 
        
        for (int i = 0; i <= nums.length; i++) {
            
            boolean containsI = false;
            for (int x : nums) {
                if (x == i) {
                    containsI = true;
                    break;
                }
            }
            
            if (!containsI) {
                num = i;
                break; 
            }
        }
        return num;
    }
}
