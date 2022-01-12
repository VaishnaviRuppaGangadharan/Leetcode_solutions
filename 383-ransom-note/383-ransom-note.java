class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character, Integer> map1 = new HashMap <Character, Integer>();
        HashMap <Character, Integer> map2 = new HashMap <Character, Integer>();
        
        for(int i=0; i<ransomNote.length(); i++){
            char currChar = ransomNote.charAt(i);
            if(map1.containsKey(currChar)){
                map1.put(currChar, map1.get(currChar)+1);
            }
            else if(!map1.containsKey(currChar)){
                map1.put(currChar, 1);
                }
        }
        
        for(int i=0; i<magazine.length(); i++){
            char currChar = magazine.charAt(i);
            if(map2.containsKey(currChar)){
                map2.put(currChar, map2.get(currChar)+1);
            }
            else if(!map2.containsKey(currChar)){
                map2.put(currChar, 1);
                }
        }
        // boolean ans = true;
        for(char c: map1.keySet()){
            if(!map2.containsKey(c)){
                return false;
            }
            if(map2.get(c) < map1.get(c)){
                return false;
                }
            }
        
        return true;
    }
}