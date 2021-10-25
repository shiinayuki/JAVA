/*
题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
//再不改动主代码的情况下，完成上述任务。
* */
package TestDemo;
/*
 *Created by ShiinaYuki on 2021/5/22 11:37 11 37
 */

import java.util.Scanner;

class Transmission{

    public String encryption(String info){

        //*************需要完善的代码**********************
        int x=Integer.parseInt(info);
        int a=x/1000;
        int b=x%1000/100;
        int c=x%100/10;
        int d=x%10;
        //每位数字都加上5,然后用和除以10的余数代替该数字
        a=(a+5)%10;
        b=(b+5)%10;
        c=(c+5)%10;
        d=(d+5)%10;
        //判断千位或个位是否为0
        info = getString(a, b, c, d);
        System.out.println("未交换的整数为:"+info);
        //交换
        int temp;
        temp=d;
        d=a;
        a=temp;
        temp=b;
        b=c;
        c=temp;
        //判断千位或个位是否为0
        info = getString(a, b, c, d);
        //*************************************************
        System.out.println("加密后的整数为:");
        return info;

    }
    //判断千位或个位是否为0的方法
    private String getString(int a, int b, int c, int d) {
        String info;
        if(d==0){
            info= String.valueOf((a*100+b*10+c)*10);
        }
        else{
            info= String.valueOf(a*1000+b*100+c*10+d);
        }
        if(a==0){
            info=String.format("%04d", b*100+c*10+d);
        }
        return info;
    }

}


public class TestDemo{

    public static void main(String[] args){

        System.out.println("请输入需要加密的四位整数：");

        Transmission info = new Transmission();

        System.out.println(info.encryption(new Scanner(System.in).next()));

    }

}

