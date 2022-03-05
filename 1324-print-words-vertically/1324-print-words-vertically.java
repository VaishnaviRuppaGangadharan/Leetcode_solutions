class Solution {
    public List<String> printVertically(String s) {
         List<String> interlist = new ArrayList<>();
         List<String> arraylist = Arrays.asList(s.split(" "));
         int maxlength = 0;
         for(int i=0; i<arraylist.size(); i++) {
             if(arraylist.get(i).length() > maxlength) {
                 maxlength = arraylist.get(i).length();
             } 
         }
         for(int i=0; i<maxlength; i++) {
             StringBuilder sb = new StringBuilder();
             for(int j=0; j<arraylist.size(); j++) {
                 if(arraylist.get(j).length()>i) sb.append(arraylist.get(j).charAt(i));
                 else sb.append(" ");
             }
             interlist.add(trimRight(sb.toString())); 
         }


         return interlist;
    }
    
    public String trimRight(String str) {
        while(str.charAt(str.length() - 1) == ' ')
                str = str.substring(0, str.length() - 1);
        return str;
    }
}