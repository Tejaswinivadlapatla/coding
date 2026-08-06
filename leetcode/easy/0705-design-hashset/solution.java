class MyHashSet {
     boolean[] set;
    public MyHashSet() {
       
        set = new boolean[1000001];
    }
    
    public void add(int key) {
        //insertd the value to HashSet stored in the set intially all the values arew false
        // if we add any element the value of thatwill become true
       set[key]=true;
    }
    
    public void remove(int key) {
        //it will remove the key it it exsit 
        // if the element was present then that value is true it we remove that element then that value becomes false 
        set[key] = false;

    }
    
    public boolean contains(int key) {
        //it contains key and tells us is the key contains or not 
        //if the elemnt was present then it will return true if not it will return the false 
        return set[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */