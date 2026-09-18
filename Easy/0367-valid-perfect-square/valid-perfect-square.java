class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true; 
        int mid , low = 1, high = num/2;
        while(low<=high){
            mid = low+ (high -low)/2;
            if((long)mid*mid == num)
                return true;
            else if((long)mid*mid > num)
                high = mid-1;
            else
                low = mid+1;

            

        }
        return false;
    }
}