class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long nCr = 1;
        for(int col = 0;col<rowIndex;col++){
            list.add((int)nCr);
            nCr = nCr*(rowIndex-col)/(col+1);
        }
        list.add(1);
        return list;
    }
 
}