class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int num1: nums1) {
            for (int num2: nums2) {
                int tot = num1 + num2;
                map.put(tot, map.getOrDefault(tot, 0) + 1);
            }
        }
        for (int num3: nums3) {
            for (int num4: nums4) {
                int tot = num3 + num4;
                if (map.containsKey(-tot)) {
                    cnt += map.get(-tot);
                }
            }
        }
        return cnt;

    }
}