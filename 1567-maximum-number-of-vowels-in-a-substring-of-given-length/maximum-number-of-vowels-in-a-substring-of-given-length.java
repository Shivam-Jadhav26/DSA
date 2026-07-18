class Solution {

     public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int maxVowel = 0;
        
        int vowel = 0 ;
        int len = s.length();

        for (int i =0 ; i<k ; i++){
            if (isVowel(s.charAt(i))){
                vowel++;
            }
        }
maxVowel = vowel;
        for (int i =k ; i<len ; i++){

             if (isVowel(s.charAt(i))){
                vowel++;
            }
            if (isVowel(s.charAt(i-k))){
                vowel--;
            }

    maxVowel = Math.max(maxVowel, vowel);
                }
                return maxVowel;

    }
}