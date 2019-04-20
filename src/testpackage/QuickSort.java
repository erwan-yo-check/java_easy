package testpackage;

/**
 * Create by erwan_yo_check~
 * DATE: 2019/4/20
 * TIME: 5:47 PM
 */
public class QuickSort {
    public static void sort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];
        while (start < end) {
            while (start<end && a[end]>=key) {  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            }
            if (a[end]<key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            while (start<end && a[start] <= key) {  //如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start ++;
            }
            if (a[start] > key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        if (start>low) {
            sort(a, low, start-1);//左边序列。第一个索引位置到关键值索引-1
        }
        if (end<high) {
            sort(a, end+1, high);//右边序列。从关键值索引+1到最后一个

        }

    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] a = {12,20,5,16,15,1,30,45,23,9};
        int start = 0;
        int end = a.length-1;
        sort(a,start,end);
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}
