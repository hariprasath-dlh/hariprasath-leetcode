// Last updated: 04/08/2026, 12:32:22
class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder ans = new StringBuilder();
        while(a>0 || b>0){
            if(a>b){
                if(a>=2){
                    ans.append("aa");
                    a = a-2;
                }
                else{
                    ans.append("a");
                    a--;
                }
                if(b>0){
                    ans.append("b");
                    b--;
                }
            }
            else if(b>a){
                if(b>=2){
                    ans.append("bb");
                    b = b-2;
                }
                else{
                    ans.append("b");
                    b--;
                }
                if(a>0){
                    ans.append("a");
                    a--;
                }
            }
            else{
                if(a>0){
                    ans.append("a");
                    a--;
                }
                else if(b>=0){
                    ans.append("b");
                    b--;
                }
            }
        }
        return ans.toString();
    }
}