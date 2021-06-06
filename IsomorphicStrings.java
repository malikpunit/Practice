class IsomorphicStrings {
   //https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1117/
    
    //Approach -1 using HashMaps
    
    public boolean isIsomorphicByHashMap(String s, String t){
        //charIn(s) -> charIn(t)
        Map<Character, Character> mappingS2T = new HashMap<>();
        
        int len = s.length();
        for(int i=0; i<len; i++){
            
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(mappingS2T.containsKey(charS)){
                if((mappingS2T.get(charS) != charT)){
                    return false;        
                }
                
            } else if(mappingS2T.containsValue(charT)){
                return false;
            }
            mappingS2T.put(charS, charT);
        }
        return true;
    }
    
    
    //Approach -2 based on index approach https://www.geeksforgeeks.org/check-if-two-given-strings-are-isomorphic-to-each-other
    public boolean isIsomorphicArray(String s, String t) {
        //traversedS[charOf(s)] ->  charOf(t) 
        int[] traversedS = new int[256];
        Arrays.fill(traversedS, -1);
        
        
        //traversedT[charOf(t)] -> charOf(s)
        int[] traversedT = new int[256];     
        Arrays.fill(traversedT, -1);
        
        
        int len = s.length();
        for(int i=0; i< len; i++){
            if(traversedS[s.charAt(i)] == -1){
                if(traversedT[t.charAt(i)] != -1){
                    return false;
                }
                traversedS[s.charAt(i)] = t.charAt(i);
                traversedT[t.charAt(i)] = s.charAt(i);
            } else if(traversedS[s.charAt(i)] != t.charAt(i) ){
                return false;
            }
        }
        return true;        
    }    
    
    //Approach -3 based on count approach https://www.geeksforgeeks.org/check-if-two-given-strings-are-isomorphic-to-each-other
    //will fail on "bbbaaaba", "aaabbbba"
    public boolean isIsomorphicCount(String s, String t) {
        //traversedS[charOf(s)] -> charOf(t)
        int[] traversedS = new int[256];
        Arrays.fill(traversedS, -1);
        
        
        //traversedT[charOf(t)] -> charOf(s)
        int[] traversedT = new int[256];     
        Arrays.fill(traversedT, -1);
        
        int len=s.length();
        
        for(int i=0; i<len; i++){
            int charS = s.charAt(i);
            int charT = t.charAt(i);
            traversedS[charS] = traversedS[charS] + 1;
            traversedT[charT] = traversedT[charT] + 1;
            
            if(traversedS[charS] != traversedT[charT]){
                return false;
            }
            
        }
        return true;
    }
      
    public boolean isIsomorphic(String s, String t) {
        //return isIsomorphicByHashMap(s, t);
        return isIsomorphicArray(s, t);
        //return isIsomorphicCount(String s, t);
    }
    
    
}
