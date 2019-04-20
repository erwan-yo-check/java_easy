/**
 * Create by erwan_yo_check~
 * DATE: 2018/10/13
 * TIME: 下午5:24
 */

/**
 * 这个测试可以称之为 多态的动态分派演示
 * 因为是有调用行为了，可以理解成调用了继承类的相关函数，所以，可以说是，动态分派；
 * 相比之下，静态的分派是对属性的（我理解）
 */
public class DynamicDispatch {

    static abstract class Human {
        protected abstract void sayHello();
    }

    static class Man extends Human {
        @Override
        protected void sayHello() {
            System.out.println("man say hello");
        }
    }

    static class Woman extends Human {
        @Override
        protected void sayHello() {
            System.out.println("woman say hello");
        }
    }

    public static void main(String[] args ){
        Human man = new Man();
        Human woman = new Woman();
        man.sayHello();
        woman.sayHello();
        man = new Woman();
        man.sayHello();
    }
}
