package day20200601;

/**
 * 利用student类，定义一个Student[]数组保存多个Student对象作为通讯录数据。
 * 程序可以通过name、email、address查询，如果找不到数据，则进行友好提示。
 * <p>
 * 找出数据，可以全匹配，也可以模糊匹配(模糊匹配难做，就先做全匹配)
 * 
 * 所有东西按规律来写，school也要完成。
 * 代码规范：
 * 所有名称都要遵循-驼峰规则
 * 类名-大写开始
 * 方法名-小写开始
 https://www.w3schools.com/java/java_methods.asp
 */
public class School {
    /**
     * 保存Student[]不能用static修饰
     */


    public static void main(String[] args) {
        //1. 初始化School类

        //2. 添加学生，虚拟数据默认全部不重复，虚拟5-10个学生

        //3. 按name查找学生，并显示学生信息name,email,address

        //4. 按email查找学生，并显示学生信息name,email,address

        //4. 按address查找学生，并显示学生信息name,email,address
    }

    /**
     * @param name
     * @return
     */
    public Student findStudentByName(String name) {
        return null;
    }

    /**
     * 按emil查找
     *
     * @param email
     * @return
     */
    public Student findStudentByEmail(String email) {
        return null;
    }

    /**
     * 按address查找
     * 具体方法自己写
     * @param email
     * @return
     */

    /**
     * 按照name,email,address添加学生
     *
     * @param name
     * @param email
     * @param address
     */
    public void addStudent(String name, String email, String address) {

    }

    /**
     * 添加学生
     *
     * @param student
     */
    public void addStudent(Student student) {

    }

}
