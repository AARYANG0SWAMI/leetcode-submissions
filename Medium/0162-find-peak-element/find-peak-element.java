class Solution {
    public int findPeakElement(int[] nums) {
        int low=0,high = nums.length-1,mid;
        if(nums.length == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[high]>nums[high-1]) return high;
        while(low<=high){
            mid = low+(high-low)/2;
            if(nums[mid]<nums[mid+1])
                low = mid+1;
                else
                high = mid-1;

        }
        return low;
    }
}