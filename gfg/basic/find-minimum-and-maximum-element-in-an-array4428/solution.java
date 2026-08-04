class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        //sort the array so that we can get the increased order of the elements 
        Arrays.sort(arr);
        // create the array list 
        ArrayList<Integer>list=new ArrayList<>();
        // add elements to the array list first was min and last was the maximum 
        list.add(arr[0]);
        list.add(arr[arr.length-1]);
        return list ;
        
    }
}
