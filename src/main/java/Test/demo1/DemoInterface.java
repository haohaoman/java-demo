package Test.demo1;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Maps;

/**
  * @Description completion javadoc.
  *
  * @author yonghao.jiang
  * @since 19 一月 2018
  */
public interface DemoInterface {

    public int num = 1;
    public String string = "1bc";

    public Map<String, String> map = new HashMap<String, String>() {
        {
            put("a", "aaa");
            put("b", "bbb");

        }
    };

    public Map<String, String> map2 = new HashMap<String, String>() {
        {
            map2.put("a", "aaa");
            map2.put("b", "bbb");

        }
    };
}
