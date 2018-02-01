package Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description completion javadoc.
 * 
 * @author yonghao.jiang
 * @since 24 一月 2018  
 */
public class AbstractClassDemo {
    private static final Map<String, Object> REGISTRIES = new ConcurrentHashMap<String, Object>();
    private static final ReentrantLock LOCK = new ReentrantLock();

    public Object getRegistry(String url) {
        String key = url;
        // Lock the registry access process to ensure a single instance of the registry
        LOCK.lock();
        try {
            Object registry = REGISTRIES.get(key);
            if (registry != null) {
                return registry;
            }
            registry = new Object();
            if (registry == null) {
                throw new IllegalStateException("Can not create registry " + url);
            }
            REGISTRIES.put(key, registry);
            return registry;
        } finally {
            // Release the lock
            LOCK.unlock();
        }
    }
}
