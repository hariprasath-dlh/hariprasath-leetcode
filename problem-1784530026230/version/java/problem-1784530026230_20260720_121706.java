// Last updated: 20/07/2026, 12:17:06
1class Solution {
2    public String multiply(String num1, String num2) {
3        if(num1.equals("0") || num2.equals("0")){
4            return "0";
5        }
6        int m = num1.length();
7        int n = num2.length();
8        int[] result = new int[m+n];
9        for(int i=m-1; i>=0; i--){
10            for(int j=n-1; j>=0; j--){
11                int digit1 = num1.charAt(i)-'0';
12                int digit2 = num2.charAt(j)-'0';
13                int product = digit1 * digit2;
14                int p2 = i+j+1;
15                int p1 = i+j;
16                int sum = product + result[p2];
17                result[p2]=sum%10;
18                result[p1] +=sum/10;
19            }
20        }
21        StringBuilder ans = new StringBuilder();
22        for(int num : result){
23            if(!(ans.length()==0 && num==0)){
24                ans.append(num);
25            }
26        }
27        return ans.toString();
28    }
29}