/*
��Ŀ��ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ����ܹ������£�ÿλ���ֶ�����5,Ȼ���úͳ���10��������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
//�ٲ��Ķ������������£������������
* */
package TestDemo;
/*
 *Created by ShiinaYuki on 2021/5/22 11:37 11 37
 */

import java.util.Scanner;

class Transmission{

    public String encryption(String info){

        //*************��Ҫ���ƵĴ���**********************
        int x=Integer.parseInt(info);
        int a=x/1000;
        int b=x%1000/100;
        int c=x%100/10;
        int d=x%10;
        //ÿλ���ֶ�����5,Ȼ���úͳ���10���������������
        a=(a+5)%10;
        b=(b+5)%10;
        c=(c+5)%10;
        d=(d+5)%10;
        //�ж�ǧλ���λ�Ƿ�Ϊ0
        info = getString(a, b, c, d);
        System.out.println("δ����������Ϊ:"+info);
        //����
        int temp;
        temp=d;
        d=a;
        a=temp;
        temp=b;
        b=c;
        c=temp;
        //�ж�ǧλ���λ�Ƿ�Ϊ0
        info = getString(a, b, c, d);
        //*************************************************
        System.out.println("���ܺ������Ϊ:");
        return info;

    }
    //�ж�ǧλ���λ�Ƿ�Ϊ0�ķ���
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

        System.out.println("��������Ҫ���ܵ���λ������");

        Transmission info = new Transmission();

        System.out.println(info.encryption(new Scanner(System.in).next()));

    }

}
