/**
 * 方法静态分派演示
 */

public class StaticDispatch {

    static abstract class Human{

    }

    static class Man extends Human{

    }

    static class Woman extends Human{

    }

    public void sayHello(Human guy) {
        System.out.println("hello, guy");
    }

    public void sayHello(Man guy) {
        System.out.println("hello, Man");
    }

    public void sayHello(Woman guy) {
        System.out.println("hello, Woman");
    }

    public static void main(String[] args) {
        StaticDispatch sr = new StaticDispatch();
        Human man = new Man();
        //静态类型变化
        sr.sayHello((Man)man);
        //实际类型变化
        man = new Woman();
        sr.sayHello(man);
        Human woman = new Woman();

        sr.sayHello(woman);
    }

}
