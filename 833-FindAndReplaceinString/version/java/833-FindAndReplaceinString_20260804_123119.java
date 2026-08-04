// Last updated: 04/08/2026, 12:31:19
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        StringBuilder ans = new StringBuilder();
4        int i=0; 
5        while(i<s.length()){
6            boolean found = false;
7            for(int j=0; j<indices.length; j++){
8                if(indices[j] == i && s.startsWith(sources[j],i)){
9                    ans.append(targets[j]);
10                    i = i+sources[j].length();
11                    found = true;
12                    break;
13                }
14            }
15            if(!found){
16                ans.append(s.charAt(i));
17                i++;
18            }
19        }
20        return ans.toString();
21    }
22}