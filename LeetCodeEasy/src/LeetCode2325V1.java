import java.util.*;

/**
 * @ClassName: LeetCode2325V1
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2023/2/1
 * @Notes: TODO
 */
public class LeetCode2325V1 {
    public static String decodeMessage(String key, String message) {
        int start = 97;
        int count = 0;
        String result = "";
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
           if (map.get(key.charAt(i))==null && key.charAt(i)!=' '){
               // System.out.println(key.charAt(i)+"-"+(char)(start + count));
               map.put(key.charAt(i),(char)(start + count));
               count++;
           }
        }
        // System.out.println(map.get(message.charAt(0)));
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i)==' '){
                result +=" ";
                continue;
            }
            result +=map.get(message.charAt(i));
        }

        return result;
    }

    public static void main(String[] args) {
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        System.out.println(decodeMessage(key,message));
    }
}
