// Last updated: 07/09/2026, 09:57:24
1class Solution {
2    public int romanToInt(String s) {
3        int result = 0;
4        for (int i = 0; i < s.length(); i++) {
5            char ch = s.charAt(i);
6            int current = 0;
7            if (ch == 'I') {
8                current = 1;
9            }
10            else if (ch == 'V') {
11                current = 5;
12            }
13            else if (ch == 'X') {
14                current = 10;
15            }
16            else if (ch == 'L') {
17                current = 50;
18            }
19            else if (ch == 'C') {
20                current = 100;
21            }
22            else if (ch == 'D') {
23                current = 500;
24            }
25            else if (ch == 'M') {
26                current = 1000;
27            }
28            if (i + 1 < s.length()) {
29                char next = s.charAt(i + 1);
30                int nextValue = 0;
31                 if (next == 'I') {
32                    nextValue = 1;
33                }
34                else if (next == 'V') {
35                    nextValue = 5;
36                }
37                else if (next == 'X') {
38                    nextValue = 10;
39                }
40                else if (next == 'L') {
41                    nextValue = 50;
42                }
43                else if (next == 'C') {
44                    nextValue = 100;
45                }
46                else if (next == 'D') {
47                    nextValue = 500;
48                }
49                else if (next == 'M') {
50                    nextValue = 1000;
51                }
52                if (current < nextValue) {
53                    result = result - current;
54                }
55                else {
56                    result = result + current;
57                }
58
59            }
60            else {
61                result = result + current;
62            }
63        }
64        return result;
65    }
66}