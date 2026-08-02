class Solution:
    def findAnagrams(self, s: str, p: str) -> list[int]:
        if len(p) > len(s):
            return []
        
        # Initialize frequency arrays for 26 lowercase English letters
        p_counts = [0] * 26
        s_counts = [0] * 26
        
        # Populate the pattern frequencies
        for char in p:
            p_counts[ord(char) - ord('a')] += 1
            
        p_len = len(p)
        result = []
        
        # Slide the window across string s
        for i in range(len(s)):
            # Add current character to window
            s_counts[ord(s[i]) - ord('a')] += 1
            
            # Remove character that falls out of the window from the left
            if i >= p_len:
                s_counts[ord(s[i - p_len]) - ord('a')] -= 1
                
            # Compare current window to pattern frequencies
            if s_counts == p_counts:
                result.append(i - p_len + 1)
                
        return result
