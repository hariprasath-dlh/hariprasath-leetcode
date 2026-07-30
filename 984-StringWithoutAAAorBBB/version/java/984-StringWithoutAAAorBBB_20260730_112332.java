// Last updated: 30/07/2026, 11:23:32
1class Solution {
2    public String strWithout3a3b(int a, int b) {
3        StringBuilder ans = new StringBuilder();
4        while(a>0 || b>0){
5            if(a>b){
6                if(a>=2){
7                    ans.append("aa");
8                    a = a-2;
9                }
10                else{
11                    ans.append("a");
12                    a--;
13                }
14                if(b>0){
15                    ans.append("b");
16                    b--;
17                }
18            }
19            else if(b>a){
20                if(b>=2){
21                    ans.append("bb");
22                    b = b-2;
23                }
24                else{
25                    ans.append("b");
26                    b--;
27                }
28                if(a>0){
29                    ans.append("a");
30                    a--;
31                }
32            }
33            else{
34                if(a>0){
35                    ans.append("a");
36                    a--;
37                }
38                else if(b>=0){
39                    ans.append("b");
40                    b--;
41                }
42            }
43        }
44        return ans.toString();
45    }
46}