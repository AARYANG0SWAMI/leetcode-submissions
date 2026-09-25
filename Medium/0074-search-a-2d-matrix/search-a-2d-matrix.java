class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length, n= matrix[0].length,mid,
        low = 0,high = m*n-1,r,c;
        while(low<=high){
            mid = low+( high-low)/2;
            c= mid%n;
            r= mid/n;
            if(matrix[r][c] == target)
                return true;
            if(matrix[r][c] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        return false;
    }
}