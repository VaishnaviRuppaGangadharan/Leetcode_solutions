class Solution {
    public int[] plusOne(int[] digits) {
        int lastDigit = digits.length - 1;
        for(int i=lastDigit; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0; 
            }
            else{
                digits[i] += 1;
                return digits;
            }
            }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
