import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: LeetCode0409V1
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/7/4
 */
public class LeetCode0409V1 {
    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != null) {
                map.put(s.charAt(i), (map.get(s.charAt(i)) + 1));
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        int res = 0;
        boolean doubleTag = false;
        for (char ch : map.keySet()) {
            if (map.get(ch) == s.length()) {
                return s.length();
            }

            if (map.get(ch) % 2 == 0) {
                res+=map.get(ch);
            } else {
                doubleTag = true;
                res+=map.get(ch)-1;
            }
        }


        System.out.println(map);
        return doubleTag?res+1:res;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bab"));

    }
}
