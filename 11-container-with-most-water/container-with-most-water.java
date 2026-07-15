class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate the width between the pointers
            int width = right - left;
            
            // Find the shorter line
            int minHeight = Math.min(height[left], height[right]);
            
            // Update maxArea if current container holds more water
            maxArea = Math.max(maxArea, minHeight * width);

            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
