package web.study.data.container;

/**
 * 自定义array list
 * <p>
 * 工作:
 * 完成所有方法的编写
 */
public class MyArrayList<T> implements MyList<T> {
    /**
     * 固定最大数据长度为100
     */
    Object[] data = new Object[100];

    /**
     * 用于记录当前数组列表中数据所在位置
     * data数据为{}时候offset为0，数据长度为0
     * data数据为{1}时候offset为1，数据长度为1
     * data数据为{1, 2, 3}时候offset为3，数据长度为3
     */
    int offset = 0;

    /**
     * 获取列表长度
     *
     * @return
     */
    public int size() {
        return 0;
    }

    /**
     * 判断是否是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return false;
    }

    public boolean add(T o) {
        return false;
    }

    /**
     * 清除数据
     * 通过改变offset
     */
    public void clear() {

    }

    public T get(int index) {
        return null;
    }

    /**
     * 最终此方法能够正常运行
     *
     * @param args
     */
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<String>();

        list.add("test01");
        list.add("test02");
        list.add("test03");
        list.add("test04");

        /**
         * 此处输出4行值
         */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.clear();
        list.add("new test03");

        /**
         * 此处输出1行值
         */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
