// Last updated: 15/09/2026, 12:17:59
1class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3        List<String> result = new ArrayList<>();
4        int i = 0;
5        while (i < words.length) {
6            int j = i, len = 0;
7            while (j < words.length && len + words[j].length() + (j - i) <= maxWidth) {
8                len += words[j].length();
9                j++;
10            }
11            int gaps = j - i - 1;
12            int spaces = maxWidth - len;
13            StringBuilder line = new StringBuilder();
14            if (j == words.length || gaps == 0) {
15                for (int k = i; k < j; k++) {
16                    line.append(words[k]);
17                    if (k != j - 1) line.append(" ");
18                }
19                while (line.length() < maxWidth) line.append(" ");
20            } else {
21                int spaceEach = spaces / gaps, extra = spaces % gaps;
22                for (int k = i; k < j; k++) {
23                    line.append(words[k]);
24                    if (k != j - 1) {
25                        int toAdd = spaceEach + (extra-- > 0 ? 1 : 0);
26                        line.append(" ".repeat(toAdd));
27                    }
28                }
29            }
30            result.add(line.toString());
31            i = j;
32        }
33        return result;
34    }
35}