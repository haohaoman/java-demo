package LeetCode.Array;

/**
 * @Description completion javadoc.
 * 
 * @author yonghao.jiang  
 * @since 30 一月 2018  
 */
public class MergeSortArray {

    public void mergeSortArray(int[] a, int[] b) {
        int i = a.length - 1;
        int j = b.length - 1;
        int k = i + j - 1;
        while (k >= 0) {
            if (i >= 0 && j >= 0) {
                if (a[i] > b[j]) {
                    a[k] = a[i];
                    i--;
                } else {
                    a[k] = b[j];
                    j--;
                }
            } else if (j >= 0) {
                a[k] = b[j];
                j--;
            } else if (i >= 0) {
                a[k] = b[i];
                i--;
            }
            k--;
        }
    }
}
