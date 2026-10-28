class Solution {
    public int[] searchRange(int[] nums, int target) {
       if(nums.length == 0) return new int[]{-1,-1};
       int result[] = {-1,-1};
       result[0] = search(nums,target, true);
       result[1] = search(nums,target,false);
        return result;
    }
    private int search(int[] nums,int target,boolean findFirst){
         int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid;

                if (findFirst)
                    high = mid - 1;  // Search left
                else
                    low = mid + 1;   // Search right
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return result;
    }
}