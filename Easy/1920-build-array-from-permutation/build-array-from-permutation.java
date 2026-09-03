class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        
        // Encode both old and new values
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }
        
        // Decode to keep only the new values
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }
        
        return nums;
    }
}
