class MyHashSet1 {

  //https://leetcode.com/explore/learn/card/hash-table/182/practical-applications/1139/
    /** Initialize your data structure here. */
    int[] arr = new int[10000000];
    
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        arr[key] = 1; 
    }
    
    public void remove(int key) {
        arr[key] = 0;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(arr[key]==0){
            return false;
        }
        return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
