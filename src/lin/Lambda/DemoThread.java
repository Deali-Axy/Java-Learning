package lin.Lambda;

/**
 * 使用lambda表达式创建线程
 */
public class DemoThread {
    public static void main(String args[]) {
        createThread_1();
        createThread_2();
    }

    /**
     * 说到函数式编程就不得不提一下lambda表达式，它是函数式编程的基础。
     * 在Java还不支持lambda表达式时，我们需要创建一个线程的话，需要编写如下代码：
     */
    static void createThread_1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running 1");
            }
        }).start();
    }

    /**
     * 而使用lambda表达式一句代码就能完成线程的创建，
     * lambda强调了函数的输入输出，隐藏了过程的细节，并且可以接受函数当作输入（参数）和输出（返回值）：
     */
    static void createThread_2() {
        new Thread(() -> System.out.println("running 2")).start();
    }
}
