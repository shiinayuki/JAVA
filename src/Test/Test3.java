package Test;
/*this program write by Shiina at 2021/6/29/17:22*/

import java.util.*;
/*-------------------------------------------------------
【程序设计】
---------------------------------------------------------

题目：编写Java Application,实现People类的定义。

要求：(1)定义People类的属性：
          姓名（字符串类型，变量名为name）
          年龄（整型，变量名为age）
          性别（字符串类型，变量名为sex）

      (2)实现People类的方法：
          定义一个有单个参数（字符串类型的变量name）的公共构造方法，用于输出变量name的值及"创建了父类对象" 。
          定义公共方法work()，无返回值，用于输出"我开始上学了"
          定义方法eat()，无返回值，用于输出"开始吃饭了！！"
          设置姓名方法，方法名为setName，无返回值

-------------------------------------------------------*/


/**********Program**********/
class People{
    String name;
    int age;
    String sex;

    public People(String name) {
        this.name = name;
        System.out.println(name + "创建了父类对象");
    }

    public void work(){
        System.out.println("我开始上学了");
    }

    public void eat(){
        System.out.println("开始吃饭了！！");
    }

    public void setName(String name) {
        this.name = name;
    }

}
/**********  End  **********/

public class Test3{
    public static void main(String args[]){
        People  p1=new People("小明");
        p1.setName("张晓明");
        p1.work();
        p1.eat();
        System.out.println("姓名："+p1.name);
        System.out.println("年龄：20");
    }
}
