package SalarySystem;

import java.io.*;
import java.util.*;
public class SalarySystem
{
	public static void main(String[] args)throws IOException{
		System.out.println("�������������");
		Scanner cin=new Scanner(System.in);
        int salary=cin.nextInt();
		System.out.println("�����빤��");
		Scanner sin=new Scanner(System.in);
        int workyear=sin.nextInt();
		int year;
	
		if
		(workyear <= 2)
		{
		System.out.println("���䲻�����겻�������");
		}
		else if(workyear>2&&workyear<5)
		{
		System.out.println("��������Ϊ5050");
		}
		else if(workyear>=5&&workyear<10)
		{
		System.out.println("��������Ϊ5065");
		}
		else if(workyear>=10&&workyear<12)
		{	
		System.out.println("��������Ϊ5080");
		}
		else if(workyear>=12&&workyear<15)
		{
		System.out.println("��������Ϊ5280");
		}
		else
		{
		System.out.println("��������Ϊ5300");
		}

			}
				}