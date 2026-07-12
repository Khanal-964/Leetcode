class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : secret.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Count bulls
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                map.put(secret.charAt(i), map.get(secret.charAt(i)) - 1);
            }
        }

        // Count cows
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) != guess.charAt(i) &&
                map.getOrDefault(guess.charAt(i), 0) > 0) {
                cows++;
                map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
            }
        }

        return bulls + "A" + cows + "B";
    }
}