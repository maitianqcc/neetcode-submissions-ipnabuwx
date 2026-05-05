class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;
        while(left < right) {
            int temp = (right - left) * Math.min(heights[left], heights[right]);
            max = Math.max(max, temp);
            if(heights[left] <= heights[right]) {
                left++;
            } else right--;
        }
        return max;
    }
}
