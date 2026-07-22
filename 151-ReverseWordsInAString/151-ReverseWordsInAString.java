// Last updated: 22/07/2026, 11:08:41
class Solution {
    public String reverseWords(String s) {
        String[] word = s.split("\\s+");
        String rev = "";
        for(int i=word.length-1; i>=0; i--){
            rev +=word[i];
            if(i!=0){
                rev +=" ";
            }
        }
        return rev.trim();
    }
}