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
  
  
    public boolean isIsomorphic(String s, String t) {
        //traversedS[charOf(s)] ->  charOf(t) 
        int[] traversedS = new int[256];
        Arrays.fill(traversedS, -1);
        
        
        //traversedT[charOf(t)] -> true
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
    
}
