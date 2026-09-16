class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        // travel the full circle and find the distance 
        int total = 0 ;
        for(int i =0;i<=distance.length-1;i++){
            total = total + distance[i];
        }
        //to handle start is lesser than the destination  
        if(start>destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        // find first route 
        int first =0 ; 
        for(int i = start;i<destination;i++){
            first = first + distance[i];
        }
        // find another route 
        int second = total - first;
        return Math.min(first,second);
    }
}