import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: LeetCode0020V1
 * @Description: 有效的括号
 * @Author: ECRZ
 * @Date: 2022/6/20
 */
public class LeetCode0020V1 {
    public static boolean isValid(String s) {
        int loc = 0;
        char[] inStr = new char[s.length()];
        Map<Character,Integer> symbol = new HashMap<>();
        symbol.put('(',1);
        symbol.put(')',1);
        symbol.put('[',2);
        symbol.put(']',2);
        symbol.put('{',3);
        symbol.put('}',3);
        for (int i = 0;i < s.length();i++){
            if (s.charAt(i)=='('|s.charAt(i)=='['|s.charAt(i)=='{'){
                inStr[loc] = s.charAt(i);
                loc++;
            }else{
                loc--;
                if (loc < 0){
                    return false;
                }
                if (symbol.get(inStr[loc])!=symbol.get(s.charAt(i))){
                    return false;
                }
            }
        }
        if (loc > 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "[";
        System.out.println(isValid(s));
    }

}
