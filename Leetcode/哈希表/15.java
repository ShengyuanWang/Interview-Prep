class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {return res;}
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i + 1, right = nums.length-1;
            while (left < right) {
                int tot = nums[i] + nums[left] + nums[right];
                if (tot < 0) {
                    left++;
                } else if (tot > 0) {
                    right--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[right] == nums[right - 1]) {right--;}
                    while (left < right && nums[left] == nums[left + 1]) {left++;} 
                    right --;
                    left ++;
                }
            }
        }
        return res;

    }
}