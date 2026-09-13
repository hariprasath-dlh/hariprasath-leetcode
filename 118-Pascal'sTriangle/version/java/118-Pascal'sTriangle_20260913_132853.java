// Last updated: 13/09/2026, 13:28:53
1import java.util.*;
2class Solution {
3    public List<Integer> getRow(int rowIndex) {
4        List<List<Integer>> triangle = new ArrayList<>();
5        for (int i = 0; i <= rowIndex; i++) {
6            List<Integer> row = new ArrayList<>();
7            row.add(1);
8            for (int j = 1; j < i; j++) {
9                int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
10                row.add(value);
11            }
12            if (i > 0) {
13                row.add(1);
14            }
15            triangle.add(row);
16        }
17        return triangle.get(rowIndex);
18    }
19}