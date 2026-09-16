class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        // Count how many times each number occurs
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr1.length; i++) {
            if(map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }
            else {
                map.put(arr1[i], 1);
            }
        }

        int[] ans = new int[arr1.length];
        int k = 0;

        // Put arr2 values first
        for(int i = 0; i < arr2.length; i++) {

            int value = arr2[i];
            int count = map.get(value);

            for(int j = 0; j < count; j++) {
                ans[k] = value;
                k++;
            }

            map.remove(value);
        }

        // Put remaining values in ascending order
        ArrayList<Integer> remaining =
            new ArrayList<>(map.keySet());

        Collections.sort(remaining);

        for(int i = 0; i < remaining.size(); i++) {

            int value = remaining.get(i);
            int count = map.get(value);

            for(int j = 0; j < count; j++) {
                ans[k] = value;
                k++;
            }
        }

        return ans;
    }
}