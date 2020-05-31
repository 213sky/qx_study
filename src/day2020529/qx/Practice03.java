package day2020529.qx;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 编写一个程序，将浮点数转换成人民币杜甫字符串，例如，将1006.333转换为壹仟零零陆元叄角叄分
 */
public class Practice03 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String n;
        // Enter the value of money
        System.out.println("Enter amount of money. 请输入金额");
        n = myObj.nextLine();
        String[] pool = {"壹", "贰","叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾",
                "佰", "仟", "万", "亿", "元", "角", "分", "整", "零"};
        String[] money = new String[n.length()];
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != '.') {
                money[i] = pool[n.charAt(i) - 1];
            }else{money[i] = " ";
            }
        }

        System.out.println(Arrays.toString(money));
    }
}
//有疑问，未完成
