class Solution {
    public int removeDuplicates(int[] nums) {
        
        int size = nums.length;
        int j=0 ;

        for (int i =0 ; i<=size-1 ; i++){
            if(nums[j]!=nums[i]){
                nums[++j]=nums[i];
            }
        }
         return j+1;
    }
   
}