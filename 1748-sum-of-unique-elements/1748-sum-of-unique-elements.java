import java.util.Arrays;

class Solution {
    public int sumOfUnique(int[] nums) {
        
        Arrays.sort(nums);
        
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
            boolean unique = true;
            
            if(i > 0 && nums[i] == nums[i - 1]) {
                unique = false;
            }
            
            if(i < nums.length - 1 && nums[i] == nums[i + 1]) {
                unique = false;
            }
            
            if(unique) {
                sum += nums[i];
            }
        }
        
        return sum;
    }
}