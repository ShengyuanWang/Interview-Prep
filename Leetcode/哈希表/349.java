class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonNumSet = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                commonNumSet.add(num);
            }
        }
        return commonNumSet.stream().mapToInt(Integer::valueOf).toArray();
    }
}