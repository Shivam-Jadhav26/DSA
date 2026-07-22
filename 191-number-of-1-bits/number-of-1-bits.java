class Solution {
    public int hammingWeight(int n) {
        int no = 0 ;
        
        String b = Integer.toBinaryString(n);
       
 for (int i = 0; i < b.length(); i++) {         
       if (b.charAt(i)== '1'){
                no++;
            }
           
        }
        return no;
    }
}