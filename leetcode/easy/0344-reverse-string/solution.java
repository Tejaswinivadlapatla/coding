class Solution {
    public void reverseString(char[] s) {
        char[] arr = new char[s.length];
        int n =s.length-1;
        for (int i=0;i<s.length;i++){
            arr[i]=s[n-i];
            
        }
        //why again i wrote the for loop : leetcode does not check the arr it checks only the s so we changed it again 
        for (int j=0;j<s.length;j++){
            s[j]=arr[j];            
        }
        System.out.println(s);
    }
}