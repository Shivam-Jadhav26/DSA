class Solution {
    public void rotate(int[] arr, int k) {
        int[] brr = Arrays.copyOf(arr, arr.length);
          k = k % arr.length;
        int start = arr.length- k ;
        int itr = 0 ;

        for (int i = start  ;i<arr.length; i++ ){
            arr[itr]=arr[i];
            itr++;
        }
        for(int i =0 ; i < start ; i++){
            arr[itr]=brr[i];
            itr++;
        }
        for(int num : arr){
            System .out.print(num);
        }
        
    }
}