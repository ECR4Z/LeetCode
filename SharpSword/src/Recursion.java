/**
 * @ClassName: Recursion
 * @Description: 递归算法
 * @Author: ECRZ
 * @Date: 2022/5/31
 */
public class Recursion {
    /**
     * 斐波那契数列:
     * 1.确认输入与输出：输入位置，输出改位置的值
     * 2.寻找递归函数结束条件： f(1) = 1，f(2) = 1,当位置为2或者1的时候，直接返回1，结束函数
     * 3.明确递归关系式：第三个位置的值由该数组的前两位决定，由此可以确定递归关系式 f(n) = f(n-1) + f(n-2)
     * @param loc
     * @return
     */

    public static int fibonacciNumbers(int loc){
        if(loc==1) return 1;
        if(loc==2) return 1;
        return fibonacciNumbers(loc-1) + fibonacciNumbers(loc-2);
    }

    public static void main(String[] args) {
        int value = fibonacciNumbers(7);
        System.out.println(value);
    }

}
