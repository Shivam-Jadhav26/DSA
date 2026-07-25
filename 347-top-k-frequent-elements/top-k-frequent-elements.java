import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Keep a Min-Heap of size k based on frequencies
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> freqMap.get(a) - freqMap.get(b)
        );

        for (int num : freqMap.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll(); // Remove the element with the lowest frequency
            }
        }

        // Step 3: Convert heap data to the final array output
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }

        return result;
    }
}
