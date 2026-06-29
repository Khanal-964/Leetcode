class Solution {
    public int minStartValue(int[] nums) {
        int min=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];  
            min=Math.min(sum, min);
        }
        //start value plus min value greater than equal to 1
        int start=1-min;
        return start;

    }
}