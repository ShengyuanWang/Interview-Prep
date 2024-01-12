class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int match = target - num;
            if (map.containsKey(match)) {
                return new int[]{i, map.get(match)};
            } 
            map.put(num, i);
        }
        return new int[0];
        

    }
}