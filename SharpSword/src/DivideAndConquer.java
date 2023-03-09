import java.util.Arrays;

/**
 * @ClassName: DivideAndConquer
 * @Description: 分治算法
 * @Author: ECRZ
 * @Date: 2022/5/31
 */
public class DivideAndConquer {
    /**
     * 二分查找
     * 1.取数组中值，判断中值是否是期待值，不是的话判断中值与期待值大小，
     * 2.比期待值大那就以中值下标-1为终点，数组最左边的值为起点切割为新数组，反之以中值下标+1为起点，数组最右边值为终点切割为新数组，
     * 3.之后循环操作判断中值与期待值大小
     * @param tag
     * @param array
     * @return
     */
    public static int binarySearch(int tag,int[] array){
        // 初始化左右值
        int start = 0;
        int end = array.length-1;
        int mid = (start + end) / 2;

        // 如果中值与期待值相等，那么就直接返回期待值坐标
        if(array[mid]==tag){
            return mid;
        }

        while (tag!=array[mid]){
            if(end<=start){
                mid = -1;
            }

            // 如果中值大于期待值，以中值下标-1为终点，数组最左边的值为起点切割为新数组
            if(array[mid]>tag){
                end = mid-1;
            }

            // 如果中值小于期待值，中值下标+1为起点，数组最右边值为终点切割为新数组
            if(array[mid]<tag){
                start = mid+1;
            }

            mid = (start + end) / 2;
        }
        return mid;
    }

    /**
     * 递归+分治的二分查找算法
     * 1.确定输入输出 (目标值、原数组、左坐标、右坐标)
     * 2.确定递归结束条件
     * 3.确定递归函数
     * @param tag
     * @param array
     * @return
     */
    public static int[] binarySearchByRecursion(int tag,int[] array,int start,int end){
        int mid = (start + end) / 2;

        // 递归函数结束条件
        if (array[mid]==tag) return new int[]{tag,mid};
        if (start>=end) return new int[]{-1};

        // 执行递归函数
        if (array[mid]>tag){
            // 注意此处需要mid - 1,不然mid将重新参与计算
            end = mid-1;
            return binarySearchByRecursion(tag,array,start,end);
        }

        if (array[mid]<tag){
            // 注意此处需要end + 1，不然mid将重新参与计算
            start = mid+1;
            return binarySearchByRecursion(tag,array,start,end);
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        int[] array = {1,5,9,11,22,32,54,57,63,66,85,99};
        // 使用循环实现的二分查找
        int loc = binarySearch(32,array);
        System.out.println(loc);

        // 使用递归实现的二分查找
        int[] s = binarySearchByRecursion(99, array,0,array.length-1);

        for (int i:s) {
            System.out.println(i);
        }
    }
}
