class Solution {
    public int strStr(String haystack, String needle) {
        int index = 0;
        
        // Loop through the haystack
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(index)) {
                index++;
            } else {
                // Backtrack: reset i to the next starting character
                i = i - index; 
                index = 0;
            }
            
            // Check if the entire needle has been matched
            if (index == needle.length()) {
                // Return the starting index of the match
                return i - needle.length() + 1;
            }
        }
        
        return -1;
    }
}
