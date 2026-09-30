class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0, sum =0;
        double MaxAvg = -Double.MAX_VALUE;
        for(int end = 0;end<nums.length;end++){
            sum += nums[end];
            if((end-start+1) == k){
                MaxAvg = Math.max(MaxAvg,(double)sum/k);
                sum -= nums[start];
                start += 1;
            }
        }
        return MaxAvg;
    }
}