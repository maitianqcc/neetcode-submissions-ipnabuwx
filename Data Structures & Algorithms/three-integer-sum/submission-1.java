class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return null;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            //skip same element
            if (i != 0 && nums[i] == nums[i-1]) {
               // i++;
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> candidate = new ArrayList<>();
                    candidate.add(nums[i]);
                    candidate.add(nums[left]);
                    candidate.add(nums[right]);
                    res.add(candidate);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else right--;
            }
            
        }
        return res;
    }
}
