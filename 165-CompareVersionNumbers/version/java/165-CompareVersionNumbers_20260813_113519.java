// Last updated: 13/08/2026, 11:35:19
1class Solution {
2    public String decodeString(String s) {
3        while(s.contains("[")) {
4            int end = s.indexOf("]");
5            int start = s.lastIndexOf("[", end);
6            int i = start - 1;
7            while(i >= 0 && Character.isDigit(s.charAt(i)))
8                i--;
9            int n = Integer.parseInt(s.substring(i + 1, start));
10            String str = s.substring(start + 1, end);
11            String temp = "";
12            for(int j = 0; j < n; j++)
13                temp += str;
14            s = s.substring(0, i + 1) + temp + s.substring(end + 1);
15        }
16        return s;
17    }
18}