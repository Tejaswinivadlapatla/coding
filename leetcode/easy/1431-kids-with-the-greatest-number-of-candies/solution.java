class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int i=0;
        boolean arr[] = new boolean[candies.length];
        // finding the maximum
        for(i=0;i<=candies.length-1;i++){
            if(candies[i] > max){
            max=candies[i];
            }
        }
        // created the list for result 
        List<Boolean> result = new ArrayList<>();
        //itterating the every candie in the list and seeing that weather by adding the extra cadies can equal or greater to it or not ; equal beacuse of the multiple kids can have greatest number of candies 
            for(i = 0;i<=candies.length-1;i++){
            if((candies[i]+extraCandies)>=max){
                result.add(true);
                //if it was greatest it returns the true in the list 
            }
            else{
                result.add(false);
                // if it was not true it returns the false 
            }
        }
        return result;
    }
}