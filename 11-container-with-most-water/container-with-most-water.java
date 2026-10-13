class Solution {
    public int maxArea(int[] height) {
        int maxVol = 0;
       int left = 0;
       int right = height.length -1;
       while(left<right){
        int minLen = Math.min(height[left],height[right]);
        maxVol = Math.max(maxVol,(right-left)*minLen);
        if(height[left] < height[right]){
            left++;
        }
        else
            right--;
       }
        return maxVol;
    }
}