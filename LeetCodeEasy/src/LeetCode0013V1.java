import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: LeetCode0013V1
 * @Description: 罗马数字转整数
 * @Author: ECRZ
 * @Date: 2022/6/10
 */
public class LeetCode0013V1 {
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = 0;
        if(s.length()==1){
            return map.get(s.charAt(0));
        }

        // 大减小加（要去绝对值）
        for(int i = 0;i <s.length();i++){
            if (i==s.length()-1){
                res +=map.get(s.charAt(i));
                break;
            }
           if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))){
                res +=map.get(s.charAt(i));
           // CM
           }else{
                res +=(map.get(s.charAt(i+1))-map.get(s.charAt(i)));
                i+=1;
           }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
