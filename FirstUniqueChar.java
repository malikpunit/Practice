class FirstUniqueChar {
    //Approach 1 - With HashMaps
    public int firstUniqCharWithHashMap(String s) {
        //Map<charIn(s), index/length>
        Map<Character, Integer>  map = new HashMap<>();
        int len = s.length();
        for(int i=0; i<len; i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, -1);    
            } else {
                map.put(ch,i);
            }
        }
        IntStream uniqueCharIndexStream = map.entrySet().stream().filter(e -> e.getValue()!=-1).mapToInt(e -> e.getValue());     
        
        int minIndex = uniqueCharIndexStream.min().orElse(-1);
        
        return minIndex;
        
    }
    
    //Approach2 - With Arrays
    public int firstUniqChar(String s) {
        int[] arr = new int[256];
        int len = s.length();
        Arrays.fill(arr, -1);
        
        
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(arr[ch] != -1){
                arr[ch] = len;
            } else{
                arr[ch] = i;
            }              
        }
        
        return Arrays.stream(arr).filter(i-> i!=-1 && i!=len).min().orElse(-1);
        
        
    }
}
