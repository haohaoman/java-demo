package Test.DynamicProxy;

/**
  * @Description completion javadoc.
  *
  * @author yonghao.jiang
  * @since 12 一月 2018
  */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("====RealSubject Request====");
    }
}
