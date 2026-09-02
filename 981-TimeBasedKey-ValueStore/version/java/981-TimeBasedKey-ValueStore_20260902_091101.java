// Last updated: 02/09/2026, 09:11:01
1class Solution {
2    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
3        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
4        int[] ans = new int[k];
5        for(int[] log : logs) {
6            map.putIfAbsent(log[0], new HashSet<>());
7            map.get(log[0]).add(log[1]);
8        }
9        for(HashSet<Integer> set : map.values())
10            ans[set.size() - 1]++;
11        return ans;
12    }
13}