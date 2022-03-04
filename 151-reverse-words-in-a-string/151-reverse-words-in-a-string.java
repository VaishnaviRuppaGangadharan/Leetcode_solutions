class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> interList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(interList);
        return String.join(" ",interList);
    }
}