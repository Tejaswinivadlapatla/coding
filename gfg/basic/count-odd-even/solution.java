class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        //initially we initialized the odd and even was 0 
        // then if condition was satisfied we incremented the count
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
        //created the new array and added the odd and even in that 
        int ans [] = new int[2];
        ans[0]=odd;
        ans[1]=even;
        return ans ;

    }
}