class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
       for(int i =0;i<grid.length;i++){
           count += BSearch(grid,i);
       } 
       return count;
       
    }
    int BSearch(int[][] grid,int i){
        int low = 0,high= grid[i].length-1,mid;
        while(low<= high){
            mid = low + (high-low)/2;
            if(grid[i][mid] < 0)
                high = mid-1;
            else
                low = mid +1;
        }
        return grid[0].length - low;
       }
}