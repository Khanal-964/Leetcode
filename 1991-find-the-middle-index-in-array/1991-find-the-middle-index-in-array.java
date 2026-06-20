class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalsum=0;
        for(int el: nums){
            totalsum+=el;
        }

        int leftsum=0;

        for(int i=0;i<nums.length;i++){
            int rightsum= totalsum-leftsum-nums[i];

            if(rightsum==leftsum) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}


//first i find out the totalsum of array of nums
//then we traverse all element to find out the pivot elements by taking the rightsum

// then we find the leftsum by reducing values of rightsum and current pivot number from totalsum then check  leftsum is equal to right sum if return index of current pivot element and update the leftmost number 