package lin.Lambda.FunctionalInterface;

/**
 * 函数接口，接口只能有一个需要实现的方法，可以使用@FunctionalInterface 注解进行声明
 */
@FunctionalInterface
public interface DemoOne {
    int doubleNum(int i);


    /**
     * 使用lambda表达式获取该接口的实现实例的几种写法：
     *
     * @param args
     */
    static void main(String args[]) {
        // 最常见的写法
        DemoOne i1 = (i) -> i * 2;
        DemoOne i2 = i -> i * 2;

        // 可以指定参数类型
        DemoOne i3 = (int i) -> i * 2;

        // 若有多行代码可以这么写
        DemoOne i4 = (int i) -> {
            System.out.println(i);
            return i * 2;
        };

        i1.doubleNum(11);
        i2.doubleNum(12);
        i3.doubleNum(13);
        i4.doubleNum(14);
    }
}
