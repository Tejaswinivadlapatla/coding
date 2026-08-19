class Solution {
    public int findNumbers(int[] nums) {
        int k =0;
        for(int i =0 ;i<=nums.length-1;i++){
            int count = 0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                count++;// we will get here the count of each element digits 
                }
                if(count%2==0){
                    k++;//here we will check weather the count is even or odd if even we will increment the value 
                }
            }
        
        return k ; 
    }
}