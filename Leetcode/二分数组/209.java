class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0;
        int sum = nums[0];
        int minLen = nums.length + 1;
        while ( l <= r && r < nums.length) {
            if (sum < target && r < nums.length - 1) {
                r++;
                sum = sum + nums[r];
            } else if (sum >= target) {
                minLen = Math.min(minLen, r - l + 1);
                sum = sum - nums[l];
                l++;
            } else {
                break;
            }
            
        }
        return minLen == nums.length + 1 ? 0 : minLen;
    }
}977.java