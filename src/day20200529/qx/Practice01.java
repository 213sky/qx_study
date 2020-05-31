package day20200529.qx;

/**
 * 使用循环输出九九乘法表，输出结果如下:
 * 1 * 1 = 1
 * 2 * 1 = 2, 2 * 2 = 4
 * ...
 * 9 * 1 = 9, 9 * 2 = 18, 9 * 3 = 27, ... 9 * 9 = 81
 */
public class Practice01 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 9; i ++){
            for(int n = 1; n < i - 1; n ++){
                System.out.printf(i + " * " + n + " = " + i * n + ", ");
            }
        System.out.println(i + " * " + i + " = " + i * i);
        }
    }
}
