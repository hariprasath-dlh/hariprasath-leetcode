// Last updated: 02/09/2026, 09:13:26
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for(int x : nums){
            set.add(x);
        }
        for(int x : set){
            if(!set.contains(x-1)){
                int count = 1;
                while(set.contains(x+count))
                    count++;
                max = Math.max(max, count);
            }
        }
        return max;
    }
}