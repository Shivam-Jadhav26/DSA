
class Solution { 
    public boolean uniqueOccurrences(int[] arr) { 
        Map<Integer, Integer> dj = new HashMap<>(); 
        
        // Count frequencies of each number
        for (int num : arr) { 
            dj.put(num, dj.getOrDefault(num, 0) + 1);
        } 
        
        // Check if all frequency values are unique
        Set<Integer> uniqueCounts = new HashSet<>(dj.values());
        
        // If sizes match, all occurrence counts are unique
        return dj.size() == uniqueCounts.size();
    } 
}
