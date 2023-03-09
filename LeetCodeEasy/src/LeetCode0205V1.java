import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: LeetCode0205V1
 * @Description: 同构字符串
 * @Author: ECRZ
 * @Date: 2022/6/30
 */
public class LeetCode0205V1 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        boolean tags = true;
        boolean tagt = true;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                tags = s.charAt(i) == s.charAt(j);
                tagt = t.charAt(i) == t.charAt(j);
                if (tags != tagt) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isIsomorphicV2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!m1.containsKey(s.charAt(i))) {
                m1.put(s.charAt(i), i);
            }
            if (!m2.containsKey(t.charAt(i))) {
                m2.put(t.charAt(i), i);
            }
        }

        String res1 = "";
        String res2 = "";
        for (int i = 0; i < s.length(); i++) {
            res1 += m1.get(s.charAt(i));
            res2 += m2.get(t.charAt(i));
        }

        System.out.println(m1);
        System.out.println(m2);
        System.out.printf("res1：%s\n", res1);
        System.out.printf("res1：%s\n", res2);
        return res1.equals(res2) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphicV2("va", "ck"));
    }
}
