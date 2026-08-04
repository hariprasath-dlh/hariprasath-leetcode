// Last updated: 04/08/2026, 12:32:27
class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder ans = new StringBuilder();
        int i=0; 
        while(i<s.length()){
            boolean found = false;
            for(int j=0; j<indices.length; j++){
                if(indices[j] == i && s.startsWith(sources[j],i)){
                    ans.append(targets[j]);
                    i = i+sources[j].length();
                    found = true;
                    break;
                }
            }
            if(!found){
                ans.append(s.charAt(i));
                i++;
            }
        }
        return ans.toString();
    }
}