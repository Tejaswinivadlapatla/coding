class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count =0 ;
        for(int i=0 ; i<=arr.length-1 ; i++){
            for(int j=i+1 ; j <= arr.length-1 ; j++){
                if(Math.abs(arr[i]-arr[j])<=a){// we will check first condition if it satisfies it will go to the next condition unless it will neglect that triplet , complexity will decrese 
                for(int k=j+1 ; k<=arr.length-1;k++){
                    
                    if(  Math.abs(arr[j] - arr[k])<=b && Math.abs(arr[i] - arr[k]) <=c ){
                    count ++; // for every good triplet count will increase
                    }
                }
                }
            }
        }
        return count ; 
    }
}