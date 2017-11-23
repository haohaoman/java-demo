package LeetCode.Array;

/**
 *  * @Description completion javadoc.  *  * @author yonghao.jiang  * @since 22 十一月 2017  
 */
public class RemoveElement {
    /**
     * Given an array and a value, remove all instances of that > value in place and return the new length. The order of
     * elements can be changed. It doesn't matter what you leave beyond the new length.
     */

    public static int solution(int[] array, int elem) {
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                continue;
            }
            array[m] = array[i];
            m++;
        }
        return m;
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 22, 3, 2, 9, 8, 2, 6, 8, 9, 2, 2 };
        int length = solution(a, 2);
        System.out.println(length);
    }
}
