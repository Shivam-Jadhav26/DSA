class Solution {
    public void sortColors(int[] arr) {
        int len = arr.length;

      Arrays.sort(arr);
      for (int num : arr){
        System.out.print(num+",");
       }


        
    }
}