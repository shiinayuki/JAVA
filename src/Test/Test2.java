package Test;
/*this program write by Shiina at 2021/6/29/16:54*/

import java.util.*;

/*-------------------------------------------------------
��������ơ�
---------------------------------------------------------

��Ŀ����дJava Application,ʵ�ֽӿ�Iarea��ʵ����Circle�Ķ��塣

Ҫ��(1) ����һ���ӿ�Iarea����������Բ����ĳ��󷽷�area()����������Ϊdouble������r��ʾ�뾶������Ϊdouble
      (2) �ڽӿ�����������PI������Ϊdouble����ֵΪ3.1415926��
      (3) ����һ����Circle��ʵ�ֽӿ�Iarea�еĳ��󷽷�area()��
      (4) ����Circle�У�����2�����԰뾶cR�����cArea��
      (5) ����Circle�У�����һ�����ð뾶����setR(),����ֵΪ�ա�
      (6) ����Circle�У�����һ����ȡ�뾶����getR(),����ֵΪdouble��


-------------------------------------------------------*/

/**********Program**********/
interface Iarea{
    double PI = 3.1415926;
    public double area(double r);
}
class Circle implements Iarea{
    double cR ;
    double cArea;
    public double area(double cR) {
        return PI * cR  * cR ;
    }
    public double getR() {
        return cR;
    }

    public void setR(double cR) {
        this.cR = cR;
    }

}
/**********  End  **********/

public class Test2{
    public static void main(String args[]){
        Circle circle=new Circle();
        circle.setR(5);
        double r1=circle.getR();
        circle.area(r1);
        System.out.println("�����"+circle.area(r1));
    }
}