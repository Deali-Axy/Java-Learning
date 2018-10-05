package lin.Lambda.FunctionalInterface.JdkBuiltIn;

import java.util.function.UnaryOperator;

/**
 * 一元函数接口
 */
public class UnaryOperatorInterface {
    public static void main(String args[]){
        UnaryOperator<Integer> unaryOperator = i -> i * 2;
        System.out.println("计算结果为：" + unaryOperator.apply(10));
    }
}
