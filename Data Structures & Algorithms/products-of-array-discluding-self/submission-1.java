class Solution {
    public int[] productExceptSelf(int[] nums) {
        // this array store all the product for left side.
        int[] prefix = new int[nums.length];
        // this array store all the product for the right side.
        int[] suffix = new int[nums.length];
        int[] res = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        suffix[nums.length - 1] = 1;
        for (int i = nums.length -2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i+1];
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix[i] * suffix[i];
        }
        return res;
    }
}  
