// Last updated: 13/08/2026, 11:18:45
1class Solution {
2    public int compareVersion(String version1, String version2){
3        String[] a = version1.split("\\.");
4        String[] b = version2.split("\\.");
5        int n = Math.max(a.length,b.length);
6        for(int i=0; i<n; i++){
7            int x = i<a.length ? Integer.parseInt(a[i]):0;
8            int y = i<b.length ? Integer.parseInt(b[i]):0;
9
10            if(x<y){
11                return -1;
12            }
13            if(x>y){
14                return 1;
15            }
16        }
17        return 0;
18    }
19}