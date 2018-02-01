package LeetCode.Array;

import java.util.Vector;

/**
 * @Description completion javadoc.
 * 
 * @author yonghao.jiang
 * @since 30 一月 2018  
 */
public class Sum {

    public void sum2(int[] nums, int target) {
        int i = nums[0]; // 头指针
        int j = nums.length - 1; // 尾指针
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                break;
            } else if (sum < target) {
                ++i;
            } else {
                --j;
            }
        }
    }

}
