/**
 * @ClassName: LeetCode0121V1
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/7/4
 */
public class LeetCode0121V1 {
    public static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<min){
                min = prices[i];
            }
            if (max < prices[i] - min){
                max = prices[i] - min;
            }
             System.out.printf("min:%d,max:%d\n",min,max);
        }
        return max;
    }

    public static void main(String[] args) {
        maxProfit(new int[]{7});
    }
}
