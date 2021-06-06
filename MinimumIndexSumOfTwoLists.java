class MinimumIndexSumOfTwoLists {

//https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1177/

    public String[] findRestaurant(String[] list1, String[] list2) {
        int leastListIndexSum = list1.length -1 + list2.length -1;
        
        List<String> arrList = new ArrayList<>();
            
        HashMap<String, Integer> map = new HashMap<>();
        int len  = list1.length;
        for(int i=0; i<len; i++){
            map.put(list1[i], i);
        }
        len = list2.length;
        for(int j=0; j<len; j++){
            String rest =  list2[j];
            if(map.containsKey(rest)){
                int indexSum = map.get(rest) + j;
                if(indexSum == leastListIndexSum){
                    arrList.add(rest);
                } else if (indexSum < leastListIndexSum){
                    leastListIndexSum = indexSum;    
                    arrList.clear();
                    arrList.add(rest);
                }
                
            } 
        }
        return arrList.toArray(new String[0]);
    }
}
