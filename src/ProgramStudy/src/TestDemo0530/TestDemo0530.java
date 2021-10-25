package ProgramStudy.src.TestDemo0530;
/*
 *Created by ShiinaYuki on 2021/5/30 23:24 23 24
 */


import java.util.*;

/*1�����һ���Լ��ĳ������ڵ���Ϣ������String���ͽ��б��棬
     Ȼ�󽫳���������Ϣת��ΪDate�����ݣ������������
     ������Ҫ�����ǰ������ʱ�䣬�����ݵ�������������в�ֵ���㣬
     ��������Ѿ������������ˣ��������������*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDemo0530{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        String dateStr; //��������������String���ͳ�������
        Date dateDate;  //��������������Date���ͳ�������

        while (true){
            System.out.println("������������ڣ�(yyyy-MM-dd)");
            dateStr = sc.next();
            dateStr = dateStr.replace("/", "-");    //תΪ��ȷ��ʽ
            dateStr = dateStr.replace("\\", "-");
            dateStr = dateStr.replace(".", "-");
            dateStr = dateStr.replace("|", "-");
            try {
                dateDate = format.parse(dateStr);
                break;
            } catch (ParseException e) {
                System.out.println("�����������������룺");
            }
        }

        System.out.println("�������ڣ�" + dateDate.toString());
        Date nowDate = new Date();
        System.out.println("��ǰʱ��: " + nowDate.toString());
        int day = (int) ((nowDate.getTime() - dateDate.getTime()) / (1000*3600*24));
        System.out.println("���Ѿ�����" + day + "����");
    }
}