package day20200601;
import java.util.Scanner;
/**
 * 编写一个学生类，提供name,age,gnder,phone,address,email成员变量，且为每个成员变量提供setter,getter方法。
 * 为学生类提供默认的构造器和带所有成员变量的构造器。
 * 为学生类提供方法，用于描绘吃，喝，玩，睡等行为,方法内输出动作即可。
 * 我把practice 1 里面的根据任意选项搜索功能也整合进来了，妈耶这个好难写，我要死了，怀念python。
 * 我手机没电了，登不上微信，它老是跟我说充电口进水了不让充电，但是都一天了水还没干。
 */
public class Student {
    private String name;
    private int age;
    private String gender;
    private int phone;
    private String address;
    private String email;

    public Student(String name, int age, String gender, int phone, String address, String email){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public void SetName(String name){
        this.name = name;
    }
    public String GetName(){
        return name;
    }
    public void SetAge(int age){
        this.age = age;
    }
    public int GetAge(int age){
        return age;
    }
    public void GetPhone(int phone){
        this.phone = phone;
    }
    public int SetPhone(){
        return phone;
    }
    public void GetAddress(String address){
        this.address = address;
    }
    public String SetAddress(){
        return address;
    }
    public void GetEmail(String email){
        this.email = email;
    }
    public String SetEmail(){
        return email;
    }
    public void ssEat(String food){
        System.out.println(name+" eats "+food);
    }
    public void ssDrink(String drinks){
        System.out.println(name+" drinks "+drinks);
    }
    public void ssPlay(String sports){
        System.out.println(name+" plays "+sports);
    }
    public static void main(String[] args){
        Student[] ss = new Student[5];
        ss[0] = new Student("Raphael", 19, "Male",1324,"Ontario","1324!@gmail.com");
        ss[1] = new Student("Lili", 21, "Female", 2345, "BC", "LiliBC2345@hotmail.com");
        ss[2] = new Student("Xiaoming", 22, "Male", 4235,"Scarbrough", "ScarbroughXiaoming@gmail.com");
        ss[3] = new Student("Henry", 17, "Male", 5136, "Toronto","HangingTree@gmail.com");
        ss[4] = new Student("Jack", 22, "Male", 2279, "RichmonHIll","Hijackgotarrested@gmail.com");
        ss[5] = new Student("Qinxin Zhang", 21, "Male", 778957,"15 Watson St. Scarbrough, Ontario Canada","Raphael.zhang@mail.utoronto.ca");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter name or email or address.");
        String value = input.nextLine();
        int i = 0;
        for(int n = 0; n < 2; n ++){
            if(value.equals(ss[n].name)||value.equals(ss[n].address)||value.equals(ss[n].email)){
                System.out.println((ss[n].name));
                System.out.println((ss[n].age));
                System.out.println((ss[n].gender));
                System.out.println((ss[n].phone));
                System.out.println((ss[n].address));
                System.out.println((ss[n].email));
                i ++;
            }
        }
        if (i == 0);
            System.out.println("This person is not in our data pool.");
    }

}
