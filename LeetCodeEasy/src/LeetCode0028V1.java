/**
 * @ClassName: LeetCode0028V1
 * @Description: 实现 strStr()
 * @Author: ECRZ
 * @Date: 2022/6/23
 */
public class LeetCode0028V1 {
    // hello ll
    public static int strStr(String haystack, String needle) {
        char start = needle.charAt(0);
        int loc = -1;
        String res = "";
        for (int i = 0; i < haystack.length(); i++) {
            if (res.length() == needle.length()) {
                return loc;
            }
            if (haystack.charAt(i) == start) {
                loc = i;
                for (int j = 0; j < needle.length(); j++) {
                    if (res.length() == needle.length()) {
                        return i;
                    }
                    if ((i + j) < haystack.length()) {
                        if (haystack.charAt(i + j) != needle.charAt(j)) {
                            res = "";
                            break;
                        } else {
                            res += "1";
                        }
                    } else {
                        return -1;
                    }

                }
            }
        }
        if (res.length() == needle.length()) {
            return loc;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("aa", "aaa"));
    }
}
