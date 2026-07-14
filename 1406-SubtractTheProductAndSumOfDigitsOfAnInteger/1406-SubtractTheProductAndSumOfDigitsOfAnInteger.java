// Last updated: 14/07/2026, 15:14:45
class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int product=1;     
       while(n!=0){
        int last=n%10;
        sum=sum+last;
        product=product*last;
        n=n/10;
       }
        return product-sum;
    }
}