// Last updated: 13/09/2026, 13:08:17
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> triangle = new ArrayList<>();
4        for (int i = 0; i < numRows; i++) {
5            List<Integer> row = new ArrayList<>();
6            row.add(1);
7            for (int j = 1; j < i; j++) {
8                int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
9                row.add(value);
10            }
11            if (i > 0) {
12                row.add(1);
13            }
14            triangle.add(row);
15        }
16        return triangle;
17    }
18}