// Last updated: 14/07/2026, 15:14:34
class Solution {
    public String capitalizeTitle(String str) {
        String[] arr = str.split(" ");
        String result = "";
        for(int i=0; i<arr.length; i++){
            String word = arr[i];
            if(word.length() <=2){
                result += word.toLowerCase();
            }
            else{
                word = word.toLowerCase();
                char first = Character.toUpperCase(word.charAt(0));
                result += first+word.substring(1);
            }
            if(i !=arr.length -1){
                result +=" ";
            }
        }
        return result;
    }
}