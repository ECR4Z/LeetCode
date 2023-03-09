/**
 * @ClassName: DynamicProgramming
 * @Description: 动态规划
 * @Author: ECRZ
 * @Date: 2022/6/8
 */
public class DynamicProgramming {
    /**
     * 爬楼梯问题
     * 前提条件：dp[n] 表示爬n级楼梯的方案数量、假设爬的层数为10层，那么可能只可能出现两种情况，最后一步要么2阶，要么1阶，
     * 出现的方案只可能为 9层所有方案+1阶和8层方案+2阶，所以我们可以得出 第n级楼梯的方案数量 = 第n-1的方案数+n-2的方案数
     * 1.定义子问题
     * 2.实现需要反复执行解决的子子问题部分
     * dp[n] = dp[n-1] + dp[n-2]
     * 3.识别并求解出边界条件
     * dp[0] = 1,dp[1] = 1,dp[2] = dp[1] + dp[0] = 2, dp[3] = dp[2] + dp[1] = 3
     */
    public static int climbStairs(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i <= n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }


    public static int climbStairsV2(int n){
        if (n == 0) return 1;
        if (n == 1) return 1;
        int n1 = 1;
        int n2 = 1;
        int res = 0;
        for (int i = 2;i<=n;i++){
            res = n1 + n2;
            n1 = n2;
            n2 = res;
        }

        return res;
    }


    public static void main(String[] args) {
        int res = climbStairs(8);
        int res2 = climbStairsV2(8);
        System.out.println(res);
        System.out.println(res2);
    }
}
