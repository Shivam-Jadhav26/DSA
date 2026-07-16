import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPairs(int[] nums, int k) {
        // Absolute difference cannot be negative
        if (k < 0) {
            return 0;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int pairsCount = 0;
        
        // Count frequencies of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Evaluate pairs based on the value of k
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            
            if (k == 0) {
                // For k = 0, we need at least two occurrences of the same number
                if (val >= 2) {
                    pairsCount++;
                }
            } else {
                // For k > 0, check if the complement (key + k) exists
                if (map.containsKey(key + k)) {
                    pairsCount++;
                }
            }
        }
        
        return pairsCount;
    }
}
