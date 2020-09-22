package demo;

/**
 * @author: guangxush
 * @create: 2020/06/14
 *
 * E:\code\wheel\Instrument\target>java -javaagent:agent.jar demo.Main
 * I've been called with no options.
 * Dog's method invoke at  Tue Sep 22 15:47:07 CST 2020
 * miao miao~
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Dog().hello());
    }
}
