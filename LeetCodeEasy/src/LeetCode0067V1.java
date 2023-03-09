/**
 * @ClassName: LeetCode0067V1
 * @Description: 二进制求和
 * @Author: ECRZ
 * @Date: 2022/6/25
 */
public class LeetCode0067V1 {
    public static String addBinary(String a, String b) {
        return tenToBit(bitToTen(a) + bitToTen(b));
    }

    // 二进制转十进制
    public static int bitToTen(String str){
        int value = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='1'){
                value+=1*(int)Math.pow(2,(str.length()-i-1));
            }else{
                value+=0*(int)Math.pow(2,(str.length()-i-1));
            }
        }
        System.out.println(value);
        return value;
    }

    // 十进制转二进制
    public static String tenToBit(int num){
        String res = "";
        String res2 = "";
        if (num == 0){
            return "0";
        }

        while(num >= 1){
            res+=num % 2;
            num = num / 2;
        }

        for (int i = res.length()-1; i >= 0; i--) {
            res2+=res.charAt(i);
        }
        return res2;
    }
    public static void main(String[] args) {
        System.out.println(addBinary("1001","00101"));
    }
}
