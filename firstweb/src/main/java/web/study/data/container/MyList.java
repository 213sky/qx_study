package web.study.data.container;


public interface MyList<T> {
    /**
     * 数据长度
     *
     * @return
     */
    int size();

    /**
     * 判断是否含有后数据
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 添加数据
     *
     * @param o
     * @return
     */
    boolean add(T o);

    /**
     * 清空列表中数据
     */
    void clear();

    /**
     * 获取第index个数据
     *
     * @param index
     * @return
     */
    T get(int index);
}
