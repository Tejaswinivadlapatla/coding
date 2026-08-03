class Solution {
    public int arraySum(int arr[]) {
        // code here
        int sum = 0;
        for(int num : arr){
            sum = sum+num;
        }
        return sum;
    }
}
