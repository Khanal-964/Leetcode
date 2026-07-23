class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        if(n<=1){
            return 0;
        }
        int max=0;

        for(int i=0;i<n-1;i++){
            if(max<(nums[i+1]-nums[i])){
                max=nums[i+1]-nums[i];
            }
        }
        return max;
    }
}