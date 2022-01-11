class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        
        triangle.get(0).add(1);
        
        for(int i=1; i<numRows; i++){
            List <Integer> currRow = new ArrayList<>();
            currRow.add(1);
            List <Integer> prevrow = triangle.get(i-1);
            for(int j=1; j<prevrow.size(); j++){
                currRow.add(prevrow.get(j -1) + prevrow.get(j));
            }
        
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle;
        
    }
}