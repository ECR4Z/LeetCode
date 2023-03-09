/**
 * @ClassName: LeetCode0066V1
 * @Description: 加一
 * @Author: ECRZ
 * @Date: 2022/6/24
 */
public class LeetCode0066V1 {
    public static int[] plusOne(int[] digits) {
        int add = 0;
        int[] addNum = new int[digits.length + 1];

        for (int i = digits.length - 1; i >= 0; i--) {
            int val = 0;
            if (i == digits.length - 1) {
                val = 1 + digits[i];
            } else {
                val = add + digits[i];
            }

            if (val == 10) {
                if (i == 0) {
                    addNum[i] = 1;
                }
                addNum[i + 1] = 0;
                add = 1;
            } else {
                addNum[i + 1] = val;
                add = 0;
            }
        }

        if (addNum[0] == 0) {
            int[] tmp = new int[addNum.length - 1];
            for (int i = 0; i < addNum.length - 1; i++) {
                tmp[i] = addNum[i + 1];
            }
            return tmp;
        }

        return addNum;
    }

    public static void main(String[] args) {
        int[] aa = plusOne(new int[]{9, 8, 9});
        for (int s : aa) {
            System.out.print(s + " ");
        }
    }
}
