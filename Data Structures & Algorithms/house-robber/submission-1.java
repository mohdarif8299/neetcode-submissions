class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];

        Arrays.fill(dp, -1);

        return helper(0, nums, dp);
    }

    private int helper(int index, int nums[], int dp[]) {
        if(index >= nums.length) return 0;

        if(dp[index] != -1) return dp[index];

        int pick = nums[index] + helper(index+2, nums, dp);
        int not_pick = helper(index+1, nums, dp);

        dp[index] = Math.max(pick, not_pick);
        return dp[index];
    }
}
