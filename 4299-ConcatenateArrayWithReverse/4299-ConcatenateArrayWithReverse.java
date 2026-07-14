// Last updated: 14/07/2026, 15:14:18
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int s = nums.length;
        int[] arr = new int[2 * s];
        for(int i=0; i<s; i++){
            arr[i] = nums[i];
        }
        for(int i=0; i<s; i++){
            arr[i + s] = nums[s - 1 - i];
        }
        return arr;
    }
}