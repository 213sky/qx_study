package day20200602;

/**
 * 限制:
 * 1. 全部用循环的方式实现不能使用替换
 * 2. 需使用到提供的方法appendStr
 * <p>
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
        int n = 4;
        String s = "";
        for(int i = 0; i < n; i ++) {
            String string1 = appendStr("#", 2 * i + 1);
            String string2 = appendStr(" ", n - i - 1);
            s +=string2 + string1 + string2 + "\n";
        }
        System.out.print(s);
    }

    /**
     * 拼接若干个字符
     *
     * @param str 输出字符
     * @param n   输出个数
     * @return
     */
    public static String appendStr(String str, int n) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            strBuilder.append(str);
        }
        return strBuilder.toString();
    }
}
