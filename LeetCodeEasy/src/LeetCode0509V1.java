/**
 * @ClassName: LeetCode0509V1
 * @Description: 斐波那契数
 * @Author: ECRZ
 * @Date: 2022/7/8
 */
public class LeetCode0509V1 {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 1;
        }
        return (fib(n-1) + fib(n-2));
    }

    public static void main(String[] args) {
        System.out.println(fib(3));

    }
}
