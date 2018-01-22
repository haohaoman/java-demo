package Test.DubboTest;

/**
 * @Description completion javadoc.
 * @author yonghao.jiang  
 * @since 18 一月 2018  
 */
public class CodeBlockDemo {
    {
        System.out.println("初始化代码");
    }

    CodeBlockDemo() {
        System.out.println("构造器");
    }

    static {
        System.out.println("静态代码块");
    }

    // 运行后输出结果?
    public static void main(String[] args) {
        {
            System.out.println("局部代码块");
        }

        new CodeBlockDemo();
        new CodeBlockDemo();
        new CodeBlockDemo();
    }
}