package lin.Lambda.FunctionalInterface.JdkBuiltIn;

import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 我们本小节来看看JDK8里自带了哪些重要的函数接口：
 */
public class FunctionInterface {
    public static void main(String args[]) {
        MyMoney me = new MyMoney(Integer.MAX_VALUE);
        Function<Integer, String> moneyFmt = i -> new DecimalFormat("#,###").format(i);
        // 函数接口支持链式操作，例如增加一个字符串
        me.printMoney(moneyFmt.andThen(s -> "人民币：" + s + " 元"));

        // BiFunction 接口
        // 比 Function 多了一个输入
        MyMoney me2 = new MyMoney(Integer.MAX_VALUE, "林");
        BiFunction<Integer, String, String> moneyFmt2 = (money, name) -> name + "的存款为：" + new DecimalFormat("#,###").format(money);
        me2.printMoney2(moneyFmt2);
    }
}

class MyMoney {
    private final int money;
    private String name = "no name";

    public MyMoney(int money) {
        this.money = money;
    }

    public MyMoney(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public void printMoney(Function<Integer, String> moneyFormat) {
        System.out.println("我的存款: " + moneyFormat.apply(this.money));
    }

    public void printMoney2(BiFunction<Integer, String, String> moneyFormat) {
        System.out.println(moneyFormat.apply(this.money, this.name));
    }
}