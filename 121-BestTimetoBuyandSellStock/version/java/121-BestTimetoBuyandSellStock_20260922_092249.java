// Last updated: 22/09/2026, 09:22:49
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min = prices[0];
4        int max = 0;
5        for(int i=1; i<prices.length; i++){
6            if(prices[i]<min){
7                min = prices[i];
8            }
9            int profit = prices[i] - min;
10            if(profit > max){
11                max = profit;
12            }
13        }
14        return max;
15    }
16}