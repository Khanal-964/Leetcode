class Solution {
    public List<String> generateParenthesis(int n) {

        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> open = new ArrayList<>();
        ArrayList<Integer> openCount = new ArrayList<>();
        ArrayList<Integer> closeCount = new ArrayList<>();

        open.add("");
        openCount.add(0);
        closeCount.add(0);

        while (!open.isEmpty()) {

            String s = open.remove(open.size() - 1);
            int o = openCount.remove(openCount.size() - 1);
            int c = closeCount.remove(closeCount.size() - 1);

            if (s.length() == 2 * n) {
                ans.add(s);
                continue;
            }

            if (o < n) {
                open.add(s + "(");
                openCount.add(o + 1);
                closeCount.add(c);
            }

            if (c < o) {
                open.add(s + ")");
                openCount.add(o);
                closeCount.add(c + 1);
            }
        }

        return ans;
    }
}