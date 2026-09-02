// Last updated: 02/09/2026, 09:11:51
class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] min = new int[n];
        min[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--){
            min[i] = Math.min(nums[i], min[i + 1]);
        }
        int max = nums[0];
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max, nums[i]);
            if (max <= min[i + 1]){
                return i + 1;
            }
        }
        return -1;
    }
}