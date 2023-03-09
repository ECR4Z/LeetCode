/**
 * @ClassName: Greedy
 * @Description: 贪心算法
 * @Author: ECRZ
 * @Date: 2022/6/6
 */
public class Greedy {
    /**
     * 题目：有 n 个活动（a1,a2,…,an）需要使用同一个资源（例如教室），资源在某个时刻只能供一个活动使用。每个活动 ai 都有一个开始时间 si 和结束时间 fi 。
     * 一旦被选择后，活动 ai 就占据半开时间区间 [si,fi) 。
     * 如果 [si,fi) 和 [sj,fj) 互不重叠，ai 和 aj 两个活动就可以被安排在这一天。
     * PS：贪心算法一般为局部最优解，局部最优解，最后整合不一定是全局最优解。贪心算法的核心就是策略的选择，选择合理的策略有利于找到全局最优解
     * 策略：1. 选择最先结束的任务(任务尽可能的多)2. 选择耗时最短的任务(任务尽可能的多)3.选择耗时最长的任务(教室的使用时间尽可能的长)
     */


    public static int[][] ArrangeTheClassroom(int[][] timeTable){
        // 策略方案：1. 选择最先结束的任务(任务尽可能的多)
        // 任务下标
        int loc = 0;

        // 尽量少的使用JavaAPI,故此此处不适用可变数组
        int[][] result = new int[timeTable.length][2];

        // 任务结束时间,找到最小的
        for(int i = 0;i < timeTable.length;i++){
            int end = Integer.MAX_VALUE;
            int[] temp = new int[2];

            for(int j = 0;j < timeTable.length;j++) {
                if (end > timeTable[i][1]) {
                    end = timeTable[i][1];
                    temp = timeTable[i];
                }
            }
            // 获取到最先结束的任务
            // 将结果表中最新的一条数据与现在即将入结果表的数据进行比较，比较任务开始时间是否符合逻辑
            if(loc!=0){
                if(result[loc-1][1]<=temp[0]){
                    result[loc] = temp;
                    loc++;
                }
            }else {
                result[loc] = temp;
                loc++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        // 第0个任务是1点到5点，不包括5点,开始时间下标为timeTable[0][0]，结束时间下标为timeTable[0][1]
        int[][] timeTable = {
                {1,5},
                {3,8},
                {5,11},
                {7,10},
                {10,14},
                {13,18},
                {15,18}
        };

        int[][] res = ArrangeTheClassroom(timeTable);
        for (int[] s:res) {
            System.out.println("开始时间："+s[0]+",结束时间："+s[1]);
        }
    }
}
