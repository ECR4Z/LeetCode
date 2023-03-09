/**
 * @ClassName: LeetCode0069V1
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/6/25
 */
public class LeetCode0069V1 {
    public static int mySqrt(int x) {
        int low = 0;
        int high = x;
        int mid = (low + high / 2);
        // l:0 h:8 m:4
        // l:0 h:3 m:1
        // l:2 h:3 m:2
        // 暂时未完成
        boolean tag = true;
        while (tag){
            if (mid*mid<x){
                low = mid + 1;
                mid = (low + high / 2);
            }
            if(mid*mid>x){
                high = mid - 1;
                mid = (low + high / 2);
            }
            if(mid*mid==x) {
                tag = false;
                return mid;
            }

            System.out.printf("low:%d,mid:%d,high:%d\n",low,mid,high);
            if (low==mid||high==mid){
                tag = false;
                return low;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(16));
    }
}
