class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) {
            return 0;
        }
        long num = 0;
        
        boolean isNegative = s.charAt(0) == '-' ? true : false;
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(i==0 && (c=='+' || c=='-')){
                continue;
            }
            if(Character.isDigit(c)){
                num = num* 10 + (c - '0');
                if(!isNegative && num>=Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                else if(isNegative && num>=(long)Integer.MAX_VALUE+1){
                    return Integer.MIN_VALUE;
                }
            }
            else{
                break;
             }
            }
        int res = (int) num;
        return isNegative ? -res: res;
        
    }
}