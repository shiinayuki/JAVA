package Test;
/*this program write by Shiina at 2021/6/29/17:22*/

import java.util.*;
/*-------------------------------------------------------
��������ơ�
---------------------------------------------------------

��Ŀ����дJava Application,ʵ��People��Ķ��塣

Ҫ��(1)����People������ԣ�
          �������ַ������ͣ�������Ϊname��
          ���䣨���ͣ�������Ϊage��
          �Ա��ַ������ͣ�������Ϊsex��

      (2)ʵ��People��ķ�����
          ����һ���е����������ַ������͵ı���name���Ĺ������췽���������������name��ֵ��"�����˸������" ��
          ���幫������work()���޷���ֵ���������"�ҿ�ʼ��ѧ��"
          ���巽��eat()���޷���ֵ���������"��ʼ�Է��ˣ���"
          ��������������������ΪsetName���޷���ֵ

-------------------------------------------------------*/


/**********Program**********/
class People{
    String name;
    int age;
    String sex;

    public People(String name) {
        this.name = name;
        System.out.println(name + "�����˸������");
    }

    public void work(){
        System.out.println("�ҿ�ʼ��ѧ��");
    }

    public void eat(){
        System.out.println("��ʼ�Է��ˣ���");
    }

    public void setName(String name) {
        this.name = name;
    }

}
/**********  End  **********/

public class Test3{
    public static void main(String args[]){
        People  p1=new People("С��");
        p1.setName("������");
        p1.work();
        p1.eat();
        System.out.println("������"+p1.name);
        System.out.println("���䣺20");
    }
}