package Test;
/*this program write by Shiina at 2021/6/29/16:54*/

import java.util.*;

/*-------------------------------------------------------
【程序设计】
---------------------------------------------------------

题目：编写Java Application,实现接口Iarea和实现类Circle的定义。

要求：(1) 定义一个接口Iarea，声明计算圆面积的抽象方法area()，返回类型为double，参数r表示半径，类型为double
      (2) 在接口中声明变量PI，类型为double，初值为3.1415926。
      (3) 定义一个类Circle，实现接口Iarea中的抽象方法area()。
      (4) 在类Circle中，声明2个属性半径cR和面积cArea。
      (5) 在类Circle中，定义一个设置半径方法setR(),返回值为空。
      (6) 在类Circle中，定义一个获取半径方法getR(),返回值为double。


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
        System.out.println("面积："+circle.area(r1));
    }
}
