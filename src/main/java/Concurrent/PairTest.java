package Concurrent;

import org.apache.commons.lang3.tuple.Pair;

/**
 *  * @Description completion javadoc.
 *  *
 *  * @author yonghao.jiang
 *  * @since 05 十二月 2017
 *  
 */
public class PairTest {
    private Pair<Long, Long> pair = Pair.of(100L, 60L);

    public static void main(String[] args) {
        PairTest pairTest = new PairTest();
        pairTest.test1();
        pairTest.test2();
    }

    public void test1() {
        System.out.println("pair" + pair);  //pair(100,60)
        Pair<Long, Long> newPair = Pair.of(3000L, 30L);
        System.out.println("newPair" + newPair);  //newPair(3000,30)
        System.out.println(newPair != pair);  //true
        System.out.println(pair.compareTo(newPair));  //-1
    }

    public void test2() {
        System.out.println("pair" + pair);  //pair(100,60)
        Pair<Long, Long> newPair = null;
        System.out.println("newPair" + newPair);  //newPairnull
        System.out.println(newPair != pair); //true
        System.out.println(pair.compareTo(newPair));  //Exception in thread "main" java.lang.NullPointerException
    }
}
