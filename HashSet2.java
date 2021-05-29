class MyHashSet {

  //https://leetcode.com/explore/learn/card/hash-table/182/practical-applications/1139/
    /** Initialize your data structure here. */
    boolean[] arr = new boolean[10000001];
    
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        arr[key] = true; 
    }
    
    public void remove(int key) {
        arr[key] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return arr[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
