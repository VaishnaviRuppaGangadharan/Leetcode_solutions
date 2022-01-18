class Solution {
    public String countAndSay(int n) {
        String result = "1";
        while(n > 1){
            StringBuilder str = new StringBuilder();
            for(int i=0; i<result.length(); i++){
                int count = 1;
                while(i+1 < result.length() && result.charAt(i)==result.charAt(i+1)){
                    count++;
                    i++;
                }
                str.append(count).append(result.charAt(i));
                }
            result = str.toString();
            --n;
    }
        return result;
    }
}