/**
 * @ClassName: LeetCode1108V1
 * @Description: IP 地址无效化
 * @Author: ECRZ
 * @Date: 2022/6/21
 */
public class LeetCode1108V1 {
    public static String defangIPaddr(String address) {
        String res = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                res += "[" + address.charAt(i) + "]";
            } else {
                res += address.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String tes = "1.1.1.1";
        System.out.println(defangIPaddr(tes));
    }
}
