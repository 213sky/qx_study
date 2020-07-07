package day20200707;

/**
 * 自定义array list
 * <p>
 * 工作:
 * 完成所有方法的编写
 */
public class MyArrayStringList implements MyList<String> {
    /**
     * 固定最大数据长度为100
     */
    String data[] = new String[100];

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
    @Override
    public int size() {
        return 0;
    }

    /**
     * 判断是否是否为空
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * 添加数据，当添加数据超过数组大小，直接屏幕输出： out of list
     * @param o
     * @return
     */
    @Override
    public boolean add(String o) {
        return false;
    }

    /**
     * 清除数据
     * 通过改变offset
     */
    @Override
    public void clear() {

    }

    /**
     * 注意：
     * 判断index是否越界：超过数组本身长度、查过数组中数据长度
    *
     * @param index
     * @return
     */
    @Override
    public String get(int index) {
        return null;
    }


}
