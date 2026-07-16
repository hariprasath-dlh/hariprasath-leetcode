// Last updated: 16/07/2026, 12:38:08
1import java.util.*;
2class Solution {
3    int[] orginal;
4    int[] current;
5    public Solution(int[] nums) {
6        orginal = nums.clone();
7        current = nums.clone();
8    }
9    
10    public int[] reset() {
11        current = orginal.clone();
12        return current;
13    }
14    
15    public int[] shuffle() {
16        Random rand = new Random();
17        for(int i=0; i<current.length; i++){
18            int j = rand.nextInt(current.length);
19            int temp = current[i];
20            current[i] = current[j];
21            current[j] = temp;
22        }
23        return current;
24    }
25}
26
27/**
28 * Your Solution object will be instantiated and called as such:
29 * Solution obj = new Solution(nums);
30 * int[] param_1 = obj.reset();
31 * int[] param_2 = obj.shuffle();
32 */