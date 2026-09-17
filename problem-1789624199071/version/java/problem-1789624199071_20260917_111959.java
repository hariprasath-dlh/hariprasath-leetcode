// Last updated: 17/09/2026, 11:19:59
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> stack = new Stack<>();
4        stack.push(-1);
5        int max = 0;
6        for (int i = 0; i < s.length(); i++) {
7            if (s.charAt(i) == '(') {
8                stack.push(i);
9            } 
10            else {
11                stack.pop();
12                if (stack.isEmpty()) {
13                    stack.push(i);
14                }        
15                else {
16                    max = Math.max(max, i - stack.peek());
17                }
18            }
19        }
20        return max;
21    }
22}