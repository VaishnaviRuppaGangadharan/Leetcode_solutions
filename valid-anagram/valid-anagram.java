class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> map1 = new HashMap <>();
        
        for(int i=0; i<s.length(); i++){
             char currChar = s.charAt(i);
             if(map1.containsKey(currChar)){
                 map1.put(currChar, map1.get(currChar)+1);
             }
             else{
                 map1.put(currChar, 1);
             }
        }
        for(int i=0; i<t.length(); i++){
            char currChar = t.charAt(i);
            if(map1.containsKey(currChar)){
                int occurence = map1.get(currChar);
                if (occurence > 1){
                    map1.put(currChar, map1.get(currChar) - 1);
                }
                else{
                    map1.remove(currChar);
                }
                }
            else
                return false;
        }
        return map1.isEmpty();
    }
}