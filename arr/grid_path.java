import java.util.Scanner;

public class grid_path {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int MOD = 1000000007;

        // Read the array values
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
        }

        // Initialize dp array
        int[][] dp = new int[n][2];
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];

        // Fill the dp array based on the given conditions
        for (int i = 1; i < n; i++) {
            // For the current row, reset dp values to minimum possible initially
            dp[i][0] = -1;
            dp[i][1] = -1;

            // Update dp[i][0]
            if (arr[i][0] > arr[i - 1][0]) {
                dp[i][0] = Math.max(dp[i][0], dp[i - 1][0] + arr[i][0]);
            }
            if (arr[i][0] > arr[i - 1][1]) {
                dp[i][0] = Math.max(dp[i][0], dp[i - 1][1] + arr[i][0]);
            }

            // Update dp[i][1]
            if (arr[i][1] > arr[i - 1][0]) {
                dp[i][1] = Math.max(dp[i][1], dp[i - 1][0] + arr[i][1]);
            }
            if (arr[i][1] > arr[i - 1][1]) {
                dp[i][1] = Math.max(dp[i][1], dp[i - 1][1] + arr[i][1]);

            }

            // If no valid move was found, keep the previous max values
            dp[i][0] = Math.max(dp[i][0], dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i][1], dp[i - 1][1]);
        }

        // Calculate the maximum value in the last row of dp
        int result = Math.max(dp[n - 1][0], dp[n - 1][1]) % MOD;
        System.out.println(result);
    }
}
