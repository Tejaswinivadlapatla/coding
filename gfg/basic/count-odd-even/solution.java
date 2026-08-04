class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int odd = 0 ;
        int even = 0 ;
        for (int num : arr  ){
            if(num %2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        int ans [] = new int[2];
        ans[0]=odd;
        ans[1]=even;
        return ans ;

    }
}