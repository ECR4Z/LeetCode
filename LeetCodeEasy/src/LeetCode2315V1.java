/**
 * @ClassName: LeetCode2315V1
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2023/1/29
 * @Notes: TODO
 */
public class LeetCode2315V1 {
    public static int countTag(String s){
        Boolean tags = true;
        int count = 0;
        for(int i = 0;i < s.length();i++){
            if (s.charAt(i)=='|'){
                tags = !tags;
            }

            if (s.charAt(i)=='*' && tags){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countTag("yo|uar|e**|b|e***au|tifu|l"));
    }
}
