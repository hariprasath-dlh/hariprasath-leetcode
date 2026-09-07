// Last updated: 07/09/2026, 08:45:22
1class Solution {
2    public boolean isValid(String s) {
3        char[] arr = new char[s.length()];
4        int index = -1;
5        for(int i=0; i<s.length(); i++){
6            char ch = s.charAt(i);
7            if(ch=='(' || ch=='{' || ch=='['){
8                index++;
9                arr[index] = ch;
10            }
11            else{
12                if(index == -1){
13                    return false;
14                }
15            char last = arr[index];
16            if((ch==')' && last !='(') || ( ch=='}' && last !='{') || (ch == ']' && last != '[') ){
17                return false;
18            }
19            index--;                
20            }
21
22        }
23        return index == -1;
24    }
25}