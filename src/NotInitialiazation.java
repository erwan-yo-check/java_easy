import testpackage.*;

public class NotInitialiazation {


    /**
     * 非主动使用类字段演示
     */
//    public static void main(String[] args) {
//        System.out.println(testpackage.SubClass.value);
//    }


    /**
     * 被动使用类字段演示2
     * 通过数组定义来引用类，是不会触发此类的初始化
     * @param args
     */
//    public static void main(String[] args) {
//        SuperClass[] sca = new SuperClass[10];
//    }

    /**
     * 被动使用类字段演示3
     * 常量在编译阶段会存入调用类的常量池中，本质上没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }

}
