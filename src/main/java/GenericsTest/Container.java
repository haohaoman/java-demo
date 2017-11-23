package GenericsTest;

/**
 *  * @Description completion javadoc.
 *  *
 *  * @author yonghao.jiang
 *  * @since 15 十一月 2017
 *  
 */
public class Container<K, V> {
    private K key;
    private V value;

    public Container(K k, V v) {
        key = k;
        value = v;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
