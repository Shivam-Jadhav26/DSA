class Solution {
    public int strStr(String haystack, String needle) {
        int len = haystack.length();
        int index = 0 ;

        for(int i =0 ; i <len ; i++){
            if(haystack.charAt(i) == needle.charAt(index)  ){
                index++;
            }else{
                i= i-index;
                index= 0 ;
            }
            if(index== needle.length()){
                return i- needle.length()+1 ;
            }
            }return -1;
        
    }
}