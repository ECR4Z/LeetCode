/**
 * @ClassName: LeetCode0001V1
 * @Description: 两数之和
 * @Author: ECRZ
 * @Date: 2022/6/10
 */
public class LeetCode0001V1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0;i < nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target) {
                    res = new int[]{i,j};
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ints = twoSum(nums,9);
        for (int i:ints) {
            System.out.println(i);
        }
    }
}
