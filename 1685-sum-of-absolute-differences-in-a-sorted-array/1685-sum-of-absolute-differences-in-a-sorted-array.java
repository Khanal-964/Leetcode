class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n= nums.length;
        int[] result = new int[n];
        int total=0;

        for(int num : nums){
            total +=num;
        }
        int leftsum=0;

        for(int i=0;i<n;i++){
            int rightsum=total-nums[i]-leftsum;

         
            
            int right=rightsum-nums[i]*(n-i-1);
               int left=nums[i]*i-leftsum;
                   result[i]=left+right;
            leftsum+=nums[i];

        }
         return result;
    }

}