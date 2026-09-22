// Last updated: 22/09/2026, 09:44:10
1class Solution {
2    public int titleToNumber(String column) {
3        int ans = 0;
4        for(int i=0; i<column.length(); i++){
5            int value = column.charAt(i) - 'A' + 1;
6            ans = ans * 26 + value;
7        }
8        return ans;
9    }
10}