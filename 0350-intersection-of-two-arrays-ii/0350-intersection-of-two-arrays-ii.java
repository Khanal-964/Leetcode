class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];

        for (int x : nums1) {
            arr[x]++;
        }

        int k = 0;

        for (int x : nums2) {
            if (arr[x] > 0) {
                nums2[k++] = x;
                arr[x]--;
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = nums2[i];
        }

        return ans;
    }
}