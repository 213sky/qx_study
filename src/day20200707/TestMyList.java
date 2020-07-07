package day20200707;

public class TestMyList {
    /**
     * 最终此方法能够正常运行
     *
     * @param args
     */
    public static void main(String[] args) {

        MyList list = new MyArrayStringList();

        /**
         * 添加4项
         * 输出结果
         */
        list.add("test01");
        list.add("test02");
        list.add("test03");
        list.add("test04");
        showListValues(list);

        /**
         * 清除原有的数据
         * 添加1项
         * 输出结果
         */
        list.clear();
        list.add("new test03");
        showListValues(list);

        /**
         * 清除原有的数据
         * 添加102项,其中2项添加不入
         * 输出结果
         */
        list.clear();
        for (int i = 0; i < 102; i++) {
            list.add("test_" + i);
        }
        showListValues(list);
    }

    private static void showListValues(MyList list) {
        System.out.println("-----");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
