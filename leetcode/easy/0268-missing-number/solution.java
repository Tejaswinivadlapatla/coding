class Solution {
    public int missingNumber(int[] nums) {
        // finding the length of array 
        int n = nums.length;
        // calculating the expected array sum 
        int sum = n*(n+1)/2;
        //fimding the missing element of the array 
        for(int i=0 ;i<=n-1 ; i++){
            sum = sum - nums[i];
        }
        return sum ;
    }
}