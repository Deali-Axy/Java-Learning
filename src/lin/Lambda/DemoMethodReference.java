package lin.Lambda;

import java.util.Arrays;

public class DemoMethodReference {
    public static void main(String args[]) {
        String[] stringsArray = {"1", "2", "3"};
        // 在学习了lambda表达式之后，我们通常会使用lambda表达式来创建匿名方法。
        // 但有的时候我们仅仅是需要调用一个已存在的方法。如下示例：
        Arrays.sort(stringsArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

        // 在jdk8中，我们可以通过一个新特性来简写这段lambda表达式。如下示例：
        // 这种特性就叫做方法引用(Method Reference)。方法引用的标准形式是：类名::方法名。
        // （注意：只需要写方法名，不需要写括号）。
        Arrays.sort(stringsArray, String::compareToIgnoreCase);

    }
}
