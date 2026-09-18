class Solution {
    public boolean checkIfExist(int[] arr) {
       HashSet<Integer> set = new HashSet<>();
       for(int i=0 ; i<=arr.length-1;i++){
        set.add(arr[i]);
        if(set.contains(arr[i]*2)){
        return true;
       }
    
       }
       
       return false;
    }
}