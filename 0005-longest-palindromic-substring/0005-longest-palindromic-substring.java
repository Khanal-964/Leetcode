class Solution {
    public String longestPalindrome(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome (aba)
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {

                String temp = s.substring(left, right + 1);

                if (temp.length() > ans.length()) {
                    ans = temp;
                }

                left--;
                right++;
            }

            // Even length palindrome (abba)
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {

                String temp = s.substring(left, right + 1);

                if (temp.length() > ans.length()) {
                    ans = temp;
                }

                left--;
                right++;
            }
        }

        return ans;
    }
}