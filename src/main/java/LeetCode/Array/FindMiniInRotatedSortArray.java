package LeetCode.Array;

/**
  * @Description completion javadoc.
  *
  * @author yonghao.jiang
  * @since 30 一月 2018
  */
public class FindMiniInRotatedSortArray {

    public int findMini(int [] arrs) {
        int size = arrs.length;

        if (size == 0) {
            return -1;
        } else if (size == 1) {
            return arrs[0];
        }

        int start = 0;
        int stop = size - 1;

        while(start < stop - 1) {
            if (arrs[start] < arrs[stop]) {
                return arrs[start];
            }

            int mid = (stop - start) /2;
            if (arrs[mid] > arrs[start]) {
                start = mid;
            } else if (arrs[mid] < arrs[stop]) {
                mid = stop;
            }
        }

        return arrs[start] < arrs[stop] ? arrs[start] : arrs[stop];

    }
}
