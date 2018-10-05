package lin.Lambda;

import java.util.stream.IntStream;

/**
 * 函数式编程更多时候是一种编程的思维方式，是种方法论。
 * 函数式与命令式编程的区别主要在于：
 * 函数式编程是告诉代码你要做什么，
 * 而命令式编程则是告诉代码要怎么做。
 * 说白了，函数式编程是基于某种语法或调用API去进行编程。
 *
 * 从以下的两个例子中，可以看出，命令式编程需要自己去实现具体的逻辑细节。
 * 而函数式编程则是调用API完成需求的实现，将原本命令式的代码写成一系列嵌套的函数调用，
 * 在函数式编程下显得代码更简洁、易懂，这就是为什么要使用函数式编程的原因之一。
 * 所以才说函数式编程是告诉代码你要做什么，而命令式编程则是告诉代码要怎么做，是一种思维的转变。
 */
public class FunctionalProgramming {
    public static void main(String args[]) {
        min_1();
        min_2();
    }

    /**
     * 例如，我们现在需要从一组数字中，找出最小的那个数字，
     * 若使用用命令式编程实现这个需求的话，那么所编写的代码如下：
     */
    private static void min_1() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }

    /**
     * 而使用函数式编程进行实现的话，所编写的代码如下：
     */
    private static void min_2() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        int min = IntStream.of(nums).min().getAsInt();
        System.out.println(min);
    }
}
