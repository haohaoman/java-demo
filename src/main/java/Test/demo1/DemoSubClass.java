package Test.demo1;

import java.util.HashMap;
import java.util.Map;

/**
  * @Description completion javadoc.
  *
  * @author yonghao.jiang
  * @since 19 一月 2018
  */
public abstract class DemoSubClass implements DemoInterface {

    public Map<String, String> subClassMap = new HashMap<String, String>() {
        {
            put("a", "ccc");
            put("b", "ddd");

        }
    };
}
