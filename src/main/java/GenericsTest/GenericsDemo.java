package GenericsTest;

/**
 *  * @Description completion javadoc.
 *  *
 *  * @author yonghao.jiang
 *  * @since 15 十一月 2017
 *  
 */
public class GenericsDemo {
    public static void main (String[] args){
        Container<String, String> c1 = new Container<String, String>("name", "findingsea");
        Container<String, Integer> c2 = new Container<String, Integer>("age", 24);
        Container<Double, Double> c3 = new Container<Double, Double>(1.1, 2.2);
        System.out.println(c1.getKey() + " : " + c1.getValue());
        System.out.println(c2.getKey() + " : " + c2.getValue());
        System.out.println(c3.getKey() + " : " + c3.getValue());

    }

}
