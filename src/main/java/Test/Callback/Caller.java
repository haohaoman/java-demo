package Test.Callback;

/**
 *  * @Description completion javadoc.  *  * @author yonghao.jiang  * @since 09 一月 2018  
 */
public class Caller {
    public MyCallInterface mc;

    public void setCallfuc(MyCallInterface mc) {
        this.mc = mc;
    }

    public void call() {
        this.mc.method();
    }
}
