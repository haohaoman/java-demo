package LeetCode.Array;

/**
 * @Description completion javadoc.
 * 
 * @author yonghao.jiang  
 * @since 01 二月 2018  
 */
public class PalindromeRectangle {

    /**
     * 121
     * 
     * @param num
     * @return
     */
    public static boolean isPalindrome(int num) {
        if (num < -1) {
            return false;
        } else if (num == 0) {
            return true;
        }
        int x = num;
        int y = 0;
        while (x != 0) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        if (y == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123231));
    }
}
