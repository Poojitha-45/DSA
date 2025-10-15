public class Coin_Change {
    public int count(int coins[],  int sum) {
      int  n = coins.length;
        long[] dp = new long[sum + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            int coin = coins[i];
            for (int j = coin; j <= sum; j++) {
                dp[j] = dp[j] + dp[j - coin];
            }
        }

        return (int) dp[sum]; // convert safely
    }
    public static void main(String[] args) {
        Coin_Change sol = new Coin_Change();
        int[] coins = {1, 2, 3};
        int sum = 4;
        int n = coins.length;
        System.out.println("Number of ways to make " + sum + " is: " + sol.count(coins, sum));
    }
}
