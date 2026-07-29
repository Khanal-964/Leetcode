class Solution {

    public int[] distributeCandies(int candies, int num_people) {

        int n = num_people;
        int[] ans = new int[n];

        int can = candies;
        int give = 1;
        int i = 0;

        while (can > 0) {

            if (can >= give) {
                ans[i] += give;
                can -= give;
            } else {
                ans[i] += can;
                can = 0;
            }

            give++;
            i++;

            if (i == n) {
                i = 0;
            }
        }

        return ans;
    }
}