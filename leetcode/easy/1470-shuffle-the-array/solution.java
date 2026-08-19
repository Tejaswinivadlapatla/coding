class Solution {
    public int[] shuffle(int[] nums, int n) {
        int s = nums.length;
        int arr[] = new int[s];//new array for the result
        int k=0;
        for(int i=0;i<n;i++){
            arr[k] = nums[i];//arr[0]=nums[0] , arr[2] = nums[1],arr[4]=nums[2]
            k++;//incrementing th k value step by step 0,2,4
            arr[k] = nums[n+i];//arr[1]=nums[3],arr[3]=nums[4],arr[5]=nums[5]
            k++;//incrementing the k value 1,3,5
        }
        return arr;
    }
}