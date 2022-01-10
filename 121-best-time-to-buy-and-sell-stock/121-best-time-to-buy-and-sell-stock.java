// class Solution {
//     public int maxProfit(int[] prices) {
//         int currProfit = 0;
//         for(int i=0; i<prices.length; i++){
//             for(int j=i+1; j<prices.length; j++){
//                 if(prices[i] < prices[j] && prices[j] - prices[i] > currProfit){
//                     currProfit =  prices[j] - prices[i];
//                 }
//             }
//         }
//         return currProfit;
        
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int range = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min) min = prices[i];
            if(prices[i]-min > range) range=prices[i]-min;
        }
        return range;
    }
}