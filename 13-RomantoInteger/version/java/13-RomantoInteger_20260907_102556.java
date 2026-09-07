// Last updated: 07/09/2026, 10:25:56
1class Solution {
2    public String longestCommonPrefix(String[] str) {
3        String prefix = str[0];
4        for(int i=1; i<str.length; i++){
5            String current = str[i];
6            int j=0;
7            while(j<prefix.length() && j<current.length() && prefix.charAt(j)==current.charAt(j)){
8                j++;
9            }
10            prefix = prefix.substring(0,j);
11            if(prefix.length()==0){
12                return "";
13            }
14        }
15        return prefix;
16    }
17}