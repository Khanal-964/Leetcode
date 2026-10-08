class Solution {
    public int waysToSplitArray(int[] nums) {
        int count=0;
        int n=nums.length;
        long totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        long leftsum=0;
        for(int i=0;i<n-1;i++){
            leftsum+=nums[i];
            long rightsum=totalsum-leftsum;
            if(leftsum>=rightsum){
                count++;
            }
        }
        return count;
    }
}