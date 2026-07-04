import java.util.HashSet;

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int length = 0;

        for (char ch : s.toCharArray()) {

            if (set.contains(ch)) {
                set.remove(ch);   // pair completed
                length += 2;
            } else {
                set.add(ch);      // store character
            }
        }

        // one extra character can be placed in center
        if (!set.isEmpty()) {
            length += 1;
        }

        return length;
    }
}