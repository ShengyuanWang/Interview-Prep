class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0, r = 0;
        while (r < nums.length) {
            if (nums[r] == val) {
                r++;
            } else {
                nums[l] = nums[r];
                r++;
                l++;
            }
        }
        return l;

    }
}