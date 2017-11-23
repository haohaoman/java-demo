package LeetCode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 *  * @Description completion javadoc.  *  * @author yonghao.jiang  * @since 23 十一月 2017  
 */
public class PascalTriangle {

    /**
     * [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]
     */

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return res;
        }
        for (int j = 0; j < numRows; j++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for (int i = 1; i < j; i++) {// 除去第一行和第二行才进这个循环
                List<Integer> prevRow = res.get(j - 1);// 当前行的上一行
                int temp = prevRow.get(i - 1) + prevRow.get(i);
                row.add(temp);
            }
            if (j != 0) {
                row.add(1);
            }
            res.add(row);

        }

        return res;
    }

    /**
     * 
     * @param rowIndex
     * @return
     */
    public static ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (rowIndex < 0) {
            return res;
        }
        res.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = res.size() - 2; j >= 0; j--) {
                res.set(j + 1, res.get(j) + res.get(j + 1));
            }
            res.add(1);
        }
        return res;
    }

    public static void main (String[] args){
        PascalTriangle.getRow(10);
    }

}
