class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int leftsum[]=new int[n];
        int rightsum[] = new int[n];

        for(int i=0;i<n;i++){
            if(i==0){
                leftsum[i]=0;
            }
            else{
                leftsum[i]=nums[i-1]+leftsum[i-1];
            }
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                rightsum[i]=0;
            }
            else{
                rightsum[i]=nums[i+1]+rightsum[i+1];
            }
        }

        for(int i=0;i<n;i++){
            ans[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return ans;
    }
}