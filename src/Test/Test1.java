package Test;
/*this program write by Shiina at 2021/6/29/16:27*/

import java.util.*;
/*-------------------------------------------------------
��������ơ�
---------------------------------------------------------

��Ŀ����дJava Application,ʵ��Peoples�������Students��ѧ�����Ķ��塣

Ҫ��(1)Students��ӵ�����ԣ�
          ѧ��ѧ�ţ��ַ������ͣ�������ΪsNum��
          ѧ���꼶���ַ������ͣ�������Ϊgrade��
      (2)Students��ķ�����2����
          ���ø�����вι��췽��������super���ø�����вι��췽��������ѧ�ţ�sNum�����꼶��grade����ʼ����
          ��дgetInfo()�������÷������ø����getInfo()���������ֱ����ѧ�ţ�sNum�����꼶��grade����ֵ��

-------------------------------------------------------*/

    class Peoples{
    String name;
    int age;
    Peoples(String newName,int newAge){
        this.name=newName;
        this.age=newAge;
    }
    void getInfo(){
        System.out.println("ѧ������:"+name);
        System.out.println("ѧ������:"+age);
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
           System.out.println("ѧ��ѧ��Ϊ" + sNum);
           System.out.println("ѧ���꼶Ϊ" + grade);
       }


    }

    /**********  End  **********/

    public class Test1{
        public static void main(String[] args){
            Students s1=new Students("Tom",20,"14401","1");
            s1.getInfo();
        }
    }
