package day2020529;

import java.util.Scanner;

/**
 * 使用循环输出等腰三角形，例如给定4(4行，此值可变动)，输出结果如下:
 */
/*
    #
   ###
  #####
 #######
 */
public class Practice02 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String n;
        // Enter the value of number n
        System.out.println("Enter the value for integer n");
        n = myObj.nextLine();
        int row = Integer. parseInt(n);
        for(int i = 1 ; i <= row ; i ++){
            String first = new String(new char[row - i]). replace("\0", " ");
            String second = new String(new char[i]). replace("\0", "#");
            String third =  new String(new char[i - 1]). replace("\0", "#");
            System.out.printf(first + second + third + first + "\n");
        }
    }
}
