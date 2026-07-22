class Solution {
    public int getSum(int a, int b) {
      if(a==0) return b;
        if(b==0) return a;
        int sum = 0;
        int c = 0;
        while(b!=0){
            sum = a^b;
            c = (a&b)<<1;
            System.out.println(sum);
            System.out.println(c);
            a = sum;
            b = c;
        }
        return sum;
}
}