package LeetCode.Array;

/**
 *  * @Description completion javadoc.  *  * @author yonghao.jiang  * @since 22 十一月 2017  
 */
public class PlusOne {
    /**
     * Given a non-negative number represented as an array of digits, plus one to the number. The digits are stored such
     * that the most significant digit is at the head of the list.
     */

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }

}
