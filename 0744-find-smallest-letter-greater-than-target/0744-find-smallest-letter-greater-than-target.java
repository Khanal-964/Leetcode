class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;
        char ans = letters[0]; // default answer (wrap around)

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (letters[mid] > target) {
                ans = letters[mid];
                right = mid - 1;     // search for smaller valid letter
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}