class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 1;
        for (int num: nums) {
            if (!set.contains(num - 1)) {
                //num is the start point
                int len = 1;
                while (set.contains(num + len)) {
                    len++;
                
                }
                 max = Math.max(max, len);
            }
            
        }
        return max;
    }
}
