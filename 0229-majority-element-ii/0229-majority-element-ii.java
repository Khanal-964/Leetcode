class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            // Skip if this number is already checked
            boolean alreadyAdded = false;
            for (int k = 0; k < ans.size(); k++) {
                if (ans.get(k) == nums[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (alreadyAdded)
                continue;

            int count = 0;

            // Count frequency of nums[i]
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // Check if frequency is more than n/3
            if (count > nums.length / 3) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}