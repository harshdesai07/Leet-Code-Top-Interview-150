import java.util.*;

public class leetcode322{
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[0] = 0;  // Base case: no coins needed to make the sum 0.

        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                if (dp[j - coin] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], 1 + dp[j - coin]);
                }
            }
        }

        return (dp[amount] == Integer.MAX_VALUE) ? -1 : dp[amount];
    }
}
