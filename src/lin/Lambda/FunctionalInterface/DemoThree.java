package lin.Lambda.FunctionalInterface;

/**
 * 当接口多重继承时，可能会发生默认方法覆盖的问题，这时可以去指定使用哪一个接口的默认方法实现，如下示例
 */
@FunctionalInterface
interface DemoThree extends Interface1, Interface2 {
    @Override
    default int add(int x, int y) {
        // 指定使用哪一个接口的默认方法实现
        return Interface2.super.add(x, y);
    }
}

@FunctionalInterface
interface Interface1 {
    int doubleNum(int i);

    default int add(int x, int y) {
        return x + y;
    }
}

@FunctionalInterface
interface Interface2 {
    int doubleNum(int i);

    default int add(int x, int y) {
        return x + y;
    }
}
