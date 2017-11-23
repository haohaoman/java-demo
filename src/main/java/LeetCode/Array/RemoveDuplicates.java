package LeetCode.Array;

/**
 *  * @Description completion javadoc.
 *  *
 *  * @author yonghao.jiang
 *  * @since 22 十一月 2017
 *  
 */
public class RemoveDuplicates {
    /**
     * Given a sorted array, remove the duplicates in place such that > each element appear only once and return the new length.
     Do not allocate extra space for another array, you must do this in place with constant memory.
     For example, Given input array A = [1,1,2],
     Your function should return length = 2, and A is now [1,2].
     */

    public static int solution(int[] array) {
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[j] != array[i]) {
                array[++j] = array[i];
            }
        }
        return j + 1;
    }

    public static void main (String[] args){
        int[] array = {1, 2, 3, 3, 3, 4, 5, 5};
        System.out.println(solution(array));
    }


}
