// Last updated: 02/09/2026, 09:12:52
class Solution {
    public String decodeString(String s) {
        while(s.contains("[")) {
            int end = s.indexOf("]");
            int start = s.lastIndexOf("[", end);
            int i = start - 1;
            while(i >= 0 && Character.isDigit(s.charAt(i)))
                i--;
            int n = Integer.parseInt(s.substring(i + 1, start));
            String str = s.substring(start + 1, end);
            String temp = "";
            for(int j = 0; j < n; j++)
                temp += str;
            s = s.substring(0, i + 1) + temp + s.substring(end + 1);
        }
        return s;
    }
}