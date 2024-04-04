 class Solution {
    public int maxDepth(String s) {
         int countBrackets = 0;
        int answer = Integer.MIN_VALUE; // Integer.MIN_VALUE for minimum integer value in Java

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                countBrackets++;
            } else if (ch == ')') {
                countBrackets--;
            }
            answer = Math.max(answer, countBrackets); // Math.max() for finding maximum value
        }

        return answer;
    }
}