class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){//iterating every element in the loop
            if(map.containsKey(nums[i])){//checking weather the hashmap was having the element of not if element was already exits it executes the if or it executes the else statement
                map.put(nums[i],map.get(nums[i])+1);
                //keeping element of array in hashmap ,  element was already present so map.get we will get the value of element then we will add1 to that value if 1 -> 1 then by ading +1 we will get 1 -> 2
            }
            else{
                map.put(nums[i],1);//if element was not present we will directly add element to it
            }
        }
        for(int values :map.values()){//iterating for loop for all values in hashmap we are not using index beacuse A HashMap doesn't have indexes like an array
            if(values>1){
                return true;
            }
        }
        return false;
    }
}