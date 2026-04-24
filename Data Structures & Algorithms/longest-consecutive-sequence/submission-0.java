class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        Arrays.sort(nums);
        int max = 1;
        int index = 0;
        while(index < nums.length) {
            int maxLen = 1;
            int j = index + 1 ;
            while (j < nums.length) {
                if (nums[j] == nums[j - 1]) {
                    j++;
                    continue;
            }
                if (nums[j] - nums[j - 1] != 1) {
                   // max = maxlen;
                    break;
                }
                maxLen++;
                j++;
            }
            max = max > maxLen ? max : maxLen;
            index = j;
        }
        return max;
    }
}
