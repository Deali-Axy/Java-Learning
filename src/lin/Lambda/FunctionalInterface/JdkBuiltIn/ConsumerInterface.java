package lin.Lambda.FunctionalInterface.JdkBuiltIn;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * 消费函数接口
 */
public class ConsumerInterface {
    public static void main(String args[]) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("这是输入的数据");

        // 这些接口一般有对基本类型的封装，使用特定类型的接口就不需要去指定泛型了，如下示例
        IntConsumer intConsumer = value -> System.out.println("输入的数据是：" + value);
        intConsumer.accept(100);
    }
}
