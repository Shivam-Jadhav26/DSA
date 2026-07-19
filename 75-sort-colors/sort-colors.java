class Solution { 
    public void sortColors(int[] nums) { 
        int len = nums.length; 
        
        // Count how many 0s, 1s, and 2s actually exist

        int count0 = 0, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else if (num == 2) count2++;
        }
        
        // Use an iterator to overwrite the array based on the actual counts
        int itr = 0; 
        
        while (itr < len) { 
            if (itr < count0) { 
                nums[itr] = 0; 
            } 
            else if (itr < count0 + count1) { 
                nums[itr] = 1; 
            } 
            else { 
                nums[itr] = 2; 
            } 
            itr++; // Increment to prevent an infinite loop
        } 
    } 
}
