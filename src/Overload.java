import java.io.Serializable;

/**
 * Create by erwan_yo_check~
 * DATE: 2018/10/13
 * TIME: 下午5:15
 */


/**
 * 这个方法如果一直一个个注释的话，会出现自动类型转化的效果，不断的输出的是注释掉的下一个输出类型值
 *
 * 可以称之为 "多态的静态分派"
 */
public class Overload {

    public static void sayHello(Object arg) {
        System.out.println("hello Object");
    }

    public static void sayHello(int arg) {
        System.out.println("helllo int");
    }

    public static void sayHello(long arg) {
        System.out.println("hello long");
    }

    public static void sayHello(Character arg){
        System.out.println("hello Character");
    }

    public static void sayHello(char arg){
        System.out.println("hello char");
    }

    public static void sayHello(char... arg){
        System.out.println("hello char...");
    }

    public static void sayHello(Serializable arg){
        System.out.println("hello Serializable");
    }

    public static void main(String[] args) {
        sayHello('a');
    }
}
