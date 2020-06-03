package day20200602;

/**
 * 假定一對兔子出生滿兩個月就可以生一對小兔子，之後每一個月又可以再生一對小兔子。
 * 假定現在有一對剛生下來的小兔子，請問一年以後應該有幾對兔子？
 *
 * 年初，只有1對小兔子。
 * 一月，小兔子還沒長大，所以還是只有1+0=1對。
 * 二月，小兔子長成大兔子，開始生下一對小兔子，共有1+1＝2對。
 * 三月，大兔子又生了一對小兔子，而小兔子還沒長大，所以共有2+1=3對。
 * 四月，第一對小兔子也長大開始生小兔子，這個月生了兩對，總共有3+2=5對。
 * 五月，第二對小兔子也長大了，所以有三對大兔子會生小兔子，總共有5+3＝8對。
 * 六月，第四月生的小兔子也長大了，所以這個月生了5對，總共有8+5＝13對。
 * ...
 */
public class Practice01 {
    public static void main(String[] args) {
        int x = f(6);
        System.out.println("f(5)="+x);
    }

    public static int f(int n) {
        /*i  is the total number of rabits at each month combined with 2 parts, part 1, matured rabits m ready for " +
                "reproduction and new born rabits ne */
        int i = 1, m = 0, ne = 1;
        for(int k = 1; k <= n; k ++){
            int n_m = m;
            m += ne;
            ne = n_m;
            i = ne + m;
        }

        return i;
    }
}
