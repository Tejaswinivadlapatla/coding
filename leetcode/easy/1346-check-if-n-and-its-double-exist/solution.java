class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0 ; i<=arr.length-1;i++){
            for(int j=0 ;j<=arr.length-1;j++){
                if((arr[j]*2)==arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
}