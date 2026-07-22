// Last updated: 22/07/2026, 11:08:19
import java.util.*;
class Solution {
    int[] orginal;
    int[] current;
    public Solution(int[] nums) {
        orginal = nums.clone();
        current = nums.clone();
    }
    
    public int[] reset() {
        current = orginal.clone();
        return current;
    }
    
    public int[] shuffle() {
        Random rand = new Random();
        for(int i=0; i<current.length; i++){
            int j = rand.nextInt(current.length);
            int temp = current[i];
            current[i] = current[j];
            current[j] = temp;
        }
        return current;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */