// Last updated: 04/08/2026, 12:32:41
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                sum--;
            else
                sum++;
            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                if (length > maxLength)
                    maxLength = length;
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}