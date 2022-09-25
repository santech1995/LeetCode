//Person with richest wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int cols = accounts[0].length;
        int rows = accounts.length;
        int max_sum = 0;
        for(int i = 0; i < rows; i++) {
            int customer_wealth = 0;
            for(int j = 0; j < cols; j++) {
                customer_wealth = customer_wealth + accounts[i][j];
                max_sum = Math.max(max_sum, customer_wealth);
            }
        }
        return max_sum;
    }
}