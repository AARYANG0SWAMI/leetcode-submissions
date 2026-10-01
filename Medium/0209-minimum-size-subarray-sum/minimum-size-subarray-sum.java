class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int end = 0;
        int winSum =0;
        int minLength = Integer.MAX_VALUE;
         for(int start =0;end<nums.length;end++){
            winSum +=nums[end];
            while(winSum>=target){
                minLength = Math.min(minLength,end-start+1);
                winSum -= nums[start];
                start += 1;
            }
        }
        return minLength == Integer.MAX_VALUE?0:minLength;
    }
}