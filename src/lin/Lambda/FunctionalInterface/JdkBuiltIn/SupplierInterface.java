package lin.Lambda.FunctionalInterface.JdkBuiltIn;

import java.util.function.Supplier;

/**
 * 提供数据接口
 */
public class SupplierInterface {
    public static void main(String args[]){
        Supplier<Integer> supplier = () -> 10 + 1;
        System.out.println("提供的数据是：" + supplier.get());
    }
}
