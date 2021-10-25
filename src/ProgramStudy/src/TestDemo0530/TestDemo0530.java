package ProgramStudy.src.TestDemo0530;
/*
 *Created by ShiinaYuki on 2021/5/30 23:24 23 24
 */


import java.util.*;

/*1、输出一个自己的出生日期的信息，并用String类型进行保存，
     然后将出生日期信息转换为Date类数据，并输出出来。
     接着需要输出当前的日期时间，最后根据当天的日期来进行差值计算，
     计算出你已经出生多少天了，并且输出天数。*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDemo0530{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        String dateStr; //声明变量，储存String类型出生日期
        Date dateDate;  //声明变量，储存Date类型出生日期

        while (true){
            System.out.println("请输入出生日期：(yyyy-MM-dd)");
            dateStr = sc.next();
            dateStr = dateStr.replace("/", "-");    //转为正确格式
            dateStr = dateStr.replace("\\", "-");
            dateStr = dateStr.replace(".", "-");
            dateStr = dateStr.replace("|", "-");
            try {
                dateDate = format.parse(dateStr);
                break;
            } catch (ParseException e) {
                System.out.println("输入有误，请重新输入：");
            }
        }

        System.out.println("出生日期：" + dateDate.toString());
        Date nowDate = new Date();
        System.out.println("当前时间: " + nowDate.toString());
        int day = (int) ((nowDate.getTime() - dateDate.getTime()) / (1000*3600*24));
        System.out.println("你已经出生" + day + "天了");
    }
}
