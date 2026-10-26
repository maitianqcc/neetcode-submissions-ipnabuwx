class Solution {
    public int maxProfit(int[] prices) {
        int tempMin = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            tempMin = Math.min(tempMin, price);
            if (price > tempMin) {
                maxProfit = Math.max(maxProfit, price - tempMin);
            }
        }
        return maxProfit;
        }
    }

