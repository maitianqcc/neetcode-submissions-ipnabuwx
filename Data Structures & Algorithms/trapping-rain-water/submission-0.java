class Solution {
    public int trap(int[] height) {
        int total = 0;
        if(height == null || height.length == 0) {
            return 0;
        }
        for (int i = 0; i < height.length; i++) {
            int leftMax = 0;
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            int rightMax = 0;
            for(int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            
            total += Math.min(leftMax, rightMax) - height[i];
        }
        return total;
    }
}
