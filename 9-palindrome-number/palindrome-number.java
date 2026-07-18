                class Solution {
    public boolean isPalindrome(int num) {
        int ans =0 ;
        int rem;
        int original = num ;


        if (num < 0) {
            return false;
        }

        while(num != 0 ){
            rem = num%10 ;
            num = num /10 ;

            ans = rem + ans *10 ;   
        }

        if (ans == original){
            return true;
        }else{
            return false;
        }
    
}
                }