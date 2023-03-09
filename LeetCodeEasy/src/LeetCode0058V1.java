/**
 * @ClassName: LeetCode0058V1
 * @Description: 最后一个单词的长度
 * @Author: ECRZ
 * @Date: 2022/6/24
 */
public class LeetCode0058V1 {
    public static int lengthOfLastWord(String s) {
        int lastSize = 0;
        boolean tag = true;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                lastSize++;
            } else if (lastSize == 0 & s.charAt(i) == ' ') {

            } else {
                break;
            }
        }
        return lastSize;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" a asdad "));
    }
}
