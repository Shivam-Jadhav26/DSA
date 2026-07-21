import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Handle empty array edge case
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 1. Sort the array so numbers line up chronologically
        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        // 2. Loop through the sorted array once
        for (int i = 1; i < nums.length; i++) {
            // Skip duplicates (e.g., [1, 2, 2, 3] treats duplicate 2s as continuous)
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Check if the current number extends the consecutive sequence
            if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            } else {
                // Sequence broke, save the highest streak and reset counter
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1;
            }
        }

        // Return the largest streak found
        return Math.max(longestStreak, currentStreak);
    }
}
