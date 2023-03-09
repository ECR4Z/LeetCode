/**
 * @ClassName: LeetCode0014V1
 * @Description: 最长公共前缀
 * @Author: ECRZ
 * @Date: 2022/6/10
 */
public class LeetCode0014V1 {
    public static String longestCommonPrefix(String[] strs) {
        String minStr = "";
        String head = strs[0];
        for (int i = 1;i < strs.length;i++){
            for (int j = 0;j < strs[i].length();j++){
                // 第二个字符串的第一个字符起-到最后一个字符串的最后一个字符止
                if(j>=head.length()){
                    break;
                }

                if (head.charAt(j)==strs[i].charAt(j)){
                    minStr+=strs[i].charAt(j);
                }else{
                    break;
                }
            }
            head = minStr;
            System.out.println(head);
            minStr = "";
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"cir","car"}));
    }
}
