class Solution {
    public int strStr(String haystack, String needle) {
        int len =  haystack.length();
       int len2 = needle.length();
         if (len < len2) {
            return -1;
        }

        for (int i =0 ; i <=len-len2 ; i++){
            if( haystack.substring(i,i+len2).equals(needle)){
                    return i;
            }

        }
        return -1;
    }
}