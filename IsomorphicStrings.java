class IsomorphicStrings {
  //https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1117/
    public boolean isIsomorphic(String s, String t) {
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
}
