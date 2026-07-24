class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums , 0 , n-1);
        reverse(nums , k , n-1);
        reverse(nums , 0 , k-1);
    }
    public void reverse (int[] num , int s, int e){
        while (e>s){
            int temp = num[s];
            num[s]= num[e];
            num[e] = temp ;
            s++;
            e--;
    }

    }   
    
}