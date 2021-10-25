package Test;
/*this program write by Shiina at 2021/6/29/16:27*/

import java.util.*;
/*-------------------------------------------------------
【程序设计】
---------------------------------------------------------

题目：编写Java Application,实现Peoples类的子类Students（学生）的定义。

要求：(1)Students类拥有属性：
          学生学号（字符串类型，变量名为sNum）
          学生年级（字符串类型，变量名为grade）
      (2)Students类的方法有2个：
          设置该类的有参构造方法，利用super调用父类的有参构造方法，并对学号（sNum）和年级（grade）初始化。
          重写getInfo()方法，该方法调用父类的getInfo()方法，并分别输出学号（sNum）和年级（grade）的值。

-------------------------------------------------------*/

    class Peoples{
    String name;
    int age;
    Peoples(String newName,int newAge){
        this.name=newName;
        this.age=newAge;
    }
    void getInfo(){
        System.out.println("学生姓名:"+name);
        System.out.println("学生年龄:"+age);
    }
}
    /**********Program**********/
   class Students extends Peoples {
       String sNum;
       String grade;
       public Students(String newName,int newAge,String sNUm,String grade){
           super(newName,newAge);
           this.sNum = sNUm;
           this.grade = grade;
       }
       void getInfo(){
           super.getInfo();
           System.out.println("学生学号为" + sNum);
           System.out.println("学生年级为" + grade);
       }


    }

    /**********  End  **********/

    public class Test1{
        public static void main(String[] args){
            Students s1=new Students("Tom",20,"14401","1");
            s1.getInfo();
        }
    }

