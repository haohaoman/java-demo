package Concurrent;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;



/**
  * @Description completion javadoc.
  *
  * @author yonghao.jiang
  * @since 26 十二月 2017
  */
public class FutureTaskTest {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10, 0,
                TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(100));
        //创建FutureTask实例
        FutureTask futureTask = new FutureTask(() -> {
            System.out.println("1");
            return false;
        });
        //执行FutureTask
        new Thread(futureTask).start();
    }
}
