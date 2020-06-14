# String a = "", a = null
String a = “” refers to an empty string while String a = null assigns a to no value.
## 问题1
1) a=null，a.toString()结果
2) (a="")与(a=null)相等吗
### 解答-问题1
1）error
2）不相等，""是空的字符串，empety String,null是没有值的none value

# == , equals()
== is a comparison operator while .equals() is a method. == is for referencing comparison but .equals() is for content comparison.
## 问题1
1) == 对引用值和基本数据类型对比的啥
School a = new School();
School b = new School();
a == b 结果
### 解答-问题1
False

# final finally finalize
final: a keyword can be used with class, method and variable. Such that a final class cannot be instantiated, a final method cannot be overridden, and a final variable cannot be changed(reassigned).

finally: a keyword used to create a block that is always going to be executed, whether exception rises or not.

finalize: a method called by the garbage collector when an object is about to be destroyed to clean up the system space.

# Abstract	Interface
Abstract
Can have abstract and non-abstract value
Don’t support multiple inheritance
Can have final, non-final, static and non-static value.
Can provide the implementation of interface.
The abstract keyword is used to declare the keyword.
Can extend to other Java Classes and implement multiple Java interface using keyword “extend”.
Can have class member like private, protected etc.

Interface
Can only have abstract value and it is default static since Java 8
Supports multiple inheritance.
Can have only final and static variable.
Cannot provide the implementation of the Abstract Class.
The interface keyword is used to declare the keyword.
Can extend another Java interface only using keyword “implement”.
Member of Java interface are public by default.

## 问题1
1) 定义一个抽象类，3个属性，3个abstract方法，3个普通方法
2) 定义一个接口类 
### 解答-问题1
public abstract class MyClass{
//普通方法
  public void f1(){
    System.out.println("this is a non_abstrract function")
    }
  public abstract void print（”this is an abstract function");
}




