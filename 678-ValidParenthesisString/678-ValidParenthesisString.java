// Last updated: 04/08/2026, 12:32:32
class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                low++;
                high++;
            }
            else if(ch == ')'){
                low--;
                high--;
            }
            else{
                low--;
                high++;
            }
            if(high<0){
                return false;
            }
            else if(low<0){
                low = 0;
            }
        }
        return low==0;
    }
}