class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
        int pal = x;
        int rev = 0;
        while(pal!=0){
            rev = rev*10 + pal%10;
            pal = pal/10;
        
        }
        return rev == x;
        }
    }
}