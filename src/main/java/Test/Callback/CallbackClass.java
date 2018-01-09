package Test.Callback;

/**
  * @Description completion javadoc.
  *
  * @author yonghao.jiang
  * @since 09 一月 2018
  */
public class CallbackClass implements MyCallInterface {
    @Override
    public void method() {
        System.out.println("callbakc method");
    }

    public static void main(String[] args) {
        Caller caller = new Caller();
        caller.setCallfuc(new CallbackClass());
        caller.call();
    }
}
