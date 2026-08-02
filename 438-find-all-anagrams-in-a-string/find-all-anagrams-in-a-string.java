import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        // Handle edge case where pattern is longer than the string
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        // Frequency arrays for 26 lowercase English letters
        int[] pCounts = new int[26];
        int[] sCounts = new int[26];

        // Fill the reference pattern frequency map
        for (int i = 0; i < p.length(); i++) {
            pCounts[p.charAt(i) - 'a']++;
        }

        int pLen = p.length();
        int sLen = s.length();

        // Slide the window across string s
        for (int i = 0; i < sLen; i++) {
            // Add the rightmost character to the current window
            sCounts[s.charAt(i) - 'a']++;

            // Remove the leftmost character that falls out of the window
            if (i >= pLen) {
                sCounts[s.charAt(i - pLen) - 'a']--;
            }

            // If the window matches the pattern length, compare frequencies
            if (i >= pLen - 1) {
                if (matches(pCounts, sCounts)) {
                    result.add(i - pLen + 1);
                }
            }
        }

        return result;
    }

    // Helper method to compare fixed-size arrays in O(1) time
    private boolean matches(int[] pCounts, int[] sCounts) {
        for (int i = 0; i < 26; i++) {
            if (pCounts[i] != sCounts[i]) {
                return false;
            }
        }
        return true;
    }
}
