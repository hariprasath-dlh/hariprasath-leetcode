// Last updated: 30/07/2026, 11:55:12
1class Solution {
2    public boolean checkValidString(String s) {
3        int low = 0;
4        int high = 0;
5        for(int i=0; i<s.length(); i++){
6            char ch = s.charAt(i);
7            if(ch == '('){
8                low++;
9                high++;
10            }
11            else if(ch == ')'){
12                low--;
13                high--;
14            }
15            else{
16                low--;
17                high++;
18            }
19            if(high<0){
20                return false;
21            }
22            else if(low<0){
23                low = 0;
24            }
25        }
26        return low==0;
27    }
28}