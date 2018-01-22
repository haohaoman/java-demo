package LoadBalance;

import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;

/**
 * @Description completion javadoc.
 * 
 * @author yonghao.jiang  
 * @since 18 一月 2018  
 */
public class RandomLoadBalance {
    private final Random random = new Random();

    protected Integer doSelect(List<Integer> invokers) {
        int length = invokers.size(); // Number of invokers
        int totalWeight = 0; // The sum of weights
        boolean sameWeight = true; // Every invoker has the same weight?
        for (int i = 0; i < length; i++) {
            int weight = i;
            totalWeight += weight; // Sum
            if (sameWeight && i > 0 && weight != i - 1) {
                sameWeight = false;
            }
        }
        if (totalWeight > 0 && !sameWeight) {
            // If (not every invoker has the same weight & at least one invoker's weight>0), select randomly based on
            // totalWeight.
            int offset = random.nextInt(totalWeight);
            // Return a invoker based on the random value.
            for (int i = 0; i < length; i++) {
                offset -= i;
                if (offset < 0) {
                    return invokers.get(i);
                }
            }
        }
        // If all invokers have the same weight value or totalWeight=0, return evenly.
        return invokers.get(random.nextInt(length));
    }

    public static void main(String[] args) {
        List l = Lists.newArrayList(1,2,3,4);
        RandomLoadBalance randomLoadBalance = new RandomLoadBalance();
        int result = randomLoadBalance.doSelect(l);
        System.out.println(result);
    }
}
