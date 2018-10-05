package lin.Lambda.FunctionalInterface.JdkBuiltIn;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * 断言函数接口
 */
public class PredicateInterface {
    public static void main(String args[]) {
        Predicate<Integer> predicate = i -> i > 0;
        System.out.println(predicate.test(1));

        IntPredicate intPredicate = value -> value > 0;
        System.out.println(intPredicate.test(-1));
    }
}
