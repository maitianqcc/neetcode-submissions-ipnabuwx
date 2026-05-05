class Solution {
    public int maxArea(int[] heights) {
        if(heights == null || heights.length == 0) return 0;
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                int total = (j - i) * Math.min(heights[j], heights[i]);
                res = Math.max(total, res);
            }
        }
        return res;
    }
}
