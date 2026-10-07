// Last updated: 07/10/2026, 11:32:03
1public class Solution {
2    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
3        char[] array1 = s1.toCharArray(), array2 = s2.toCharArray();
4        int count1 = 0, count2 = 0, i = 0, j = 0;
5        while (count1 < n1) {
6            if (array1[i] == array2[j]) {
7                j++;
8                if (j == array2.length) {
9                    j = 0;
10                    count2++;
11                }
12            }
13            i++;
14            if (i == array1.length) {
15                i = 0;
16                count1++;
17            }
18        }
19        return count2 / n2;
20    }
21}