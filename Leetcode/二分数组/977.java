class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0, j = nums.length - 1, k = nums.length -1;
        while (i <= j) {
            if (nums[i]* nums[i] < nums[j] * nums[j]) {
                res[k] = nums[j]* nums[j];
                j--;
                k--;
            } else {
                res[k] = nums[i]* nums[i];
                i++;
                k--;
            }
        }
        return res;

    }
}