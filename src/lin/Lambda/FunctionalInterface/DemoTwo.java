package lin.Lambda.FunctionalInterface;

/**
 * 比较重要的一个接口特性是接口的默认方法，用于提供默认实现。
 * 默认方法和普通实现类的方法一样，可以使用this等关键字
 * <p>
 * 之所以说默认方法这个特性比较重要，是因为我们借助这个特性可以在以前所编写的一些接口上提供默认实现，并且不会影响任何的实现类以及既有的代码。
 * 例如我们最熟悉的List接口，在JDK1.2以来List接口就没有改动过任何代码，到了1.8之后才使用这个新特性增加了一些默认实现。
 * 这是因为如果没有默认方法的特性的话，修改接口代码带来的影响是巨大的，而有了默认方法后，增加默认实现可以不影响任何的代码。
 */
@FunctionalInterface
public interface DemoTwo {
    int doubleNum(int i);

    default int add(int x, int y) {
        return x + y;
    }

    public static void main(String args[]) {
        DemoTwo i2 = i -> i * 2;
        System.out.println(i2.doubleNum(10));
        System.out.println(i2.add(1, 2));
    }
}
