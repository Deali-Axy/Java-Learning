package lin.Lambda.FunctionalInterface.JdkBuiltIn;

import java.util.function.BinaryOperator;

/**
 * 二元函数接口
 */
public class BinaryOperatorInterface {
    public static void main(String args[]){
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println("计算结果为：" + binaryOperator.apply(10, 10));
    }
}
