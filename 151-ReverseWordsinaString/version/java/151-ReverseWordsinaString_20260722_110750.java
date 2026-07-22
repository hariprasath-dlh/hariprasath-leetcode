// Last updated: 22/07/2026, 11:07:50
1class Solution {
2    public String reverseWords(String s) {
3        String[] word = s.split("\\s+");
4        String rev = "";
5        for(int i=word.length-1; i>=0; i--){
6            rev +=word[i];
7            if(i!=0){
8                rev +=" ";
9            }
10        }
11        return rev.trim();
12    }
13}