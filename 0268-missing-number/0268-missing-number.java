class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        int expected = n* (n+1)/2;

        int actualsum=0;

        for(int num: nums){
            actualsum +=num;
        }

        return expected-actualsum;
    }
}