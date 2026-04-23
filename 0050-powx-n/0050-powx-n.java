class Solution {
    public double myPow(double x, int n) {
        if(x%2==0 && x<=0){
            return Math.pow(x,n);
        }
         else if(x%2!=0 && x<=0 &&n<0){
            return Math.pow(x,n);
        }else if(n>0 && x<=0){
            return Math.pow(x,n);
        }
        else if(x<=0){
            return -1;
        }
        else{
            return Math.pow(x,n);
        }
    }
}