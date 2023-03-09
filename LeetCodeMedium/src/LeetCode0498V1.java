import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: LeetCode0498V1
 * @Description: 对角线遍历
 * @Author: ECRZ
 * @Date: 2022/6/14
 */
public class LeetCode0498V1 {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        res[0] = mat[0][0];
        res[m*n-1] = mat[m-1][n-1];
        int count = 1;
        int size = 1;
        int x = 0;
        int y = 0;
        for (int i = 1;i < (m + n - 2);i++){
            if (i % 2 != 0){
                // 往下走，x-1,y+1
                if (i < n){
                    x = 0;
                    y = i;
                }else{
                    x = i-n+1;
                    y = n-1;
                }
                if (i < m){
                    size++;
                }
                if (i >=n){
                    size--;
                }
                res[count] = mat[x][y];
                count++;
                for (int s = 0;s < size-1;s++){
                    x = x+1;
                    y = y-1;
                    res[count] = mat[x][y];
                    count++;
                }

            }else{
                // 往上走，y-1,x+1
                if (i < m){
                    x = i;
                    y = 0;
                }else{
                    x = m-1;
                    y = i-m+1;
                }
                if (i < m){
                    size++;
                }
                if (i >=n){
                    size--;
                }
                res[count] = mat[x][y];
                count++;
                for (int s = 0;s < size-1;s++){
                    x = x-1;
                    y = y+1;
                    res[count] = mat[x][y];
                    count++;
                }
                System.out.println();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1,2,3,4,5},
                {4,5,6,7,8},
                {4,5,6,7,8}
        };

        int[][] array2 = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] s = findDiagonalOrder(array);

        for (int sa:s) {
            System.out.print(sa+" ");
        }
    }
}
