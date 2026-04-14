class Solution {
    public boolean hasDuplicate(int[] nums) {
        // hashset O(1)
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }
}