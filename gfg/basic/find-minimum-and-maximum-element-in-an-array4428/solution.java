class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            if(num<min)
            min = num;
        }
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(num>max)
            max = num;
        }
        list.add(min);
        list.add(max);
        
        return list ;
    }
}
