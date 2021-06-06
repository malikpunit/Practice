class IsomorphicStrings {
  //https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1117/
    public boolean isIsomorphic(String s, String t) {
        //charIn(s) -> charIn(t)
        Map<Character, Character> mappingS2T = new HashMap<>();
        
        int len = s.length();
        for(int i=0; i<len; i++){
            
            if(mappingS2T.containsKey(s.charAt(i))  && (mappingS2T.get(s.charAt(i)) != t.charAt(i))){
                return false;    
            }
            
            if(mappingS2T.containsValue(t.charAt(i)) && !mappingS2T.containsKey(s.charAt(i))){
                return false;
            }
            mappingS2T.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
}
