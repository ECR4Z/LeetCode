/**
 * @ClassName: LeetCode0009V1
 * @Description: 回文数
 * @Author: ECRZ
 * @Date: 2022/6/10
 */
public class LeetCode0009V1 {
    public static boolean isPalindrome(int x) {
        String SX = String.valueOf(x);
        boolean tag = true;
        for (int i = 0; i < (SX.length()/2); i++) {

            if(SX.charAt(i)!=SX.charAt(SX.length()-i-1)){
                tag = false;
            }
        }
        return tag;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11311));
    }
}
