class Solution { 
    public int pivotIndex(int[] nums) {
        // int totalsum=0;
        // for(int el : nums){
        //     totalsum+=el;
        // }
        // int leftsum=0;
        // for(int i=0;i<nums.length;i++){
        //     int rightsum= totalsum-leftsum-nums[i];
        //     if(leftsum==rightsum) return i;
        //     leftsum+=nums[i];
        // }
        // return -1;


        int left[]=new int[nums.length];
        int right[] =  new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                left[i]=0;
            }
            else{

                left[i]=nums[i-1]+left[i-1];
            }

        }
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                right[i]=0;
            }

            else{
                right[i]=nums[i+1]+right[i+1];
            }
        }
        for(int i=0;i<nums.length;i++){
        if(right[i]==left[i]){
            return i;
        }
        }
        return -1;
        

    }
}
/*
firstly we find out the total sum of the array
 then i traverse array to findout left sum everytime thats why i put leftsum out of the loop
 then inside of loop i find out the right sum, so for finding out the rightsum i subtracted leftsum and pivot element's sum from the total sum 
 and i compare if left and right sum became equal or not if yes return the index where we are right now
 then add element in leftsum 
 */