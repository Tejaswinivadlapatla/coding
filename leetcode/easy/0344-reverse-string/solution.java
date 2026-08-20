class Solution {
    public void reverseString(char[] s) {
        // by using two pointers approach
        int left = 0 ;
        int right = s.length-1;
        for(int i = 0;i<s.length-1;i++){
            while(left<right){// if it meets the midpoint it stops the poniter moving
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
            }
        }
        System.out.println(s);
    }
}