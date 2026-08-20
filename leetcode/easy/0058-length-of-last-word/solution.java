class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        //created the array by slpitting the s base on the " "
        int n =words.length-1;
        int max = 0 ;
        // they are asking the last word so iterated to the last word and finally returned the sizr of last words
        for(int i = words.length-1 ; i>=0;i--){
           max = words[n].length();
        }
        return max;
    }
}