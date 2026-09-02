// Last updated: 02/09/2026, 09:11:34
class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        int[] ans = new int[k];
        for(int[] log : logs) {
            map.putIfAbsent(log[0], new HashSet<>());
            map.get(log[0]).add(log[1]);
        }
        for(HashSet<Integer> set : map.values())
            ans[set.size() - 1]++;
        return ans;
    }
}