class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m = matrix.length,n = matrix[0].length;
       boolean ans = false;
        for(int i =0;i<m;i++){
            if(matrix[i][0]<=target)
                ans = BSearch(matrix,target,i,n);
                if(ans == true)
                    return true;
        }
        return false;
    }
    private boolean BSearch(int[][] matrix,int target,int i,int n){
        int low = 0,high = n-1,mid;
        while(low<=high){
            mid = low + (high-low)/2;
            if(matrix[i][mid] == target)
                return true;
            if(matrix[i][mid] < target)
                low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}