class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {    
            if (nums[i] > 0 && nums[i] > target) {
                return res;
            }

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j = i +1 ; j < nums.length; j++) {
                if (j > i+1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int left = j + 1, right = nums.length -1 ;
                while (left < right) {
                    long tot = nums[left] + nums[right] + nums[i] + nums[j];
                    if (tot < target) {
                        left++;
                    } else if (tot > target){
                        right--;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right --;
                    }
                }
            }
        }
        return res;
    }
}