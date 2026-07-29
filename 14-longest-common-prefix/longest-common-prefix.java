class Solution {
    public String longestCommonPrefix(String[] v) {
 int len = v.length;

    if (v == null || v.length == 0) return "";

    Arrays.sort(v); 
    StringBuilder sb = new StringBuilder(); 
    String first = v[0];
    String last = v[len-1];
    
    for(int i = 0 ; i < Math.min(first.length() , last.length()) ; i++){
        if(first.charAt(i) != last.charAt(i) ){
            return sb.toString(); 
        }
        sb.append(first.charAt(i)); 
        
    }
    return sb.toString(); 

    
    }
}   