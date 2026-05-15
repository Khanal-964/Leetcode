class Solution {
    public boolean isValid(String s) {

        char[] st = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                st[++top] = c;
            } 
            else {

                if (top == -1)
                    return false;

                char x = st[top--];

                if ((c == ')' && x != '(') ||
                    (c == '}' && x != '{') ||
                    (c == ']' && x != '['))
                    return false;
            }
        }

        return top == -1;
    }
}