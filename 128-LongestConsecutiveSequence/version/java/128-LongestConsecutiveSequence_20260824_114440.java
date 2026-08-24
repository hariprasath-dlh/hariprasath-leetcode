// Last updated: 24/08/2026, 11:44:40
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        int max = 0;
5        for(int x : nums){
6            set.add(x);
7        }
8        for(int x : set){
9            if(!set.contains(x-1)){
10                int count = 1;
11                while(set.contains(x+count))
12                    count++;
13                max = Math.max(max, count);
14            }
15        }
16        return max;
17    }
18}