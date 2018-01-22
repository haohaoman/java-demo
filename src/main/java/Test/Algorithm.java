package Test;

/**
 * @Description completion javadoc.
 * 
 * @author yonghao.jiang  
 * @since 19 一月 2018  
 */
public class Algorithm {
    /**
     * 给定一个数组，代表每天股票的价格，买卖一次找到最大的收益。
     * 
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minVal = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > minVal) {
                maxProfit = Math.max(maxProfit, prices[i] - minVal);
            } else {
                minVal = prices[i];
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int [] a = {13,9,6,77,9,46,355,65,33,222,8,77};
        int result = maxProfit(a);
        System.out.println(result);
    }
}
