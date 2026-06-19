
  class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly =new int[n];
        ugly[0]=1;
        int i2=0,i3=0,i5=0;

        for(int i=1;i<n;i++){
            int next2=ugly[i2]*2;
            int next3=ugly[i3]*3;
            int next5=ugly[i5]*5;


            int nextUgly=Math.min(next2, Math.min(next3, next5));
            ugly[i]=nextUgly;
            if(next2==nextUgly) i2++;
            if(next3==nextUgly) i3++;
            if(next5==nextUgly) i5++;
        }
        return ugly[n-1];

    }
}
