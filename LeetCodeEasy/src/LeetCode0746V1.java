/**
 * @ClassName: LeetCode0746V1
 * @Description: 使用最小花费爬楼梯
 * @Author: ECRZ
 * @Date: 2022/7/11
 */
public class LeetCode0746V1 {
    public static int minCostClimbingStairs(int[] cost) {
        // f(i) = min {f (i-1) , f(i)}
        int min = 0;
        if (cost.length==3){
            min = (cost[0]+cost[2])>=cost[1]?cost[1]:cost[0]+cost[2];
        }

        if (cost.length==2){
            min = cost[0]>=cost[1]?cost[1]:cost[0];
        }

        if (cost.length==1){
            min = cost[0];
        }


        // 当长度超过4的时候
        System.out.println(min);
        return min;
    }

    public static void main(String[] args) {
        minCostClimbingStairs(new int[]{10,15,20});
    }
}
