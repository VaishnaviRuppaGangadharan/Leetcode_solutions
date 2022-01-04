class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for(int i=0; i<operations.length; i++){
        switch(operations[i]){
            case "X++":
                sum+=1;
                break;
            case "++X":
                sum+=1;
                break;
            case "X--":
                sum-=1;
                break;
            case "--X":
                sum-=1;
                break;
            
        }
    }
    return sum;
    }
}