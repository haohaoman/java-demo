package Test.DubboTest;

/**
  * @Description completion javadoc.
  *
  * @author yonghao.jiang
  * @since 18 一月 2018
  */
class SubClass extends SuperClass
{
    public String name = "SubClass";
    public static void main(String[] args) {
        SuperClass clz = new SubClass();
        //你觉得这里输出什么?
        System.out.println(clz.name);
    }
}



