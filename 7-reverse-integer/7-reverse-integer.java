class Solution {
    public int reverse(int x) {
        long rev = 0;
        int sign = 1;
        while(x!=0){
            rev = rev*10 + x%10;
            if ((sign * rev >= Integer.MAX_VALUE) || (sign * rev <= Integer.MIN_VALUE)) {
			return 0;
		}
            x = x/10;
        }
        if(x<0){
            sign = -1;
            long ans = sign * (int)rev;
            return (int)ans;
        }
        else{
            return (int)rev;
        }
    }
}