package SalarySystem;

import java.io.*;
import java.util.*;
public class SalarySystem
{
	public static void main(String[] args)throws IOException{
		System.out.println("请输入基础工资");
		Scanner cin=new Scanner(System.in);
        int salary=cin.nextInt();
		System.out.println("请输入工龄");
		Scanner sin=new Scanner(System.in);
        int workyear=sin.nextInt();
		int year;
	
		if
		(workyear <= 2)
		{
		System.out.println("工龄不到两年不参与调整");
		}
		else if(workyear>2&&workyear<5)
		{
		System.out.println("调整后工资为5050");
		}
		else if(workyear>=5&&workyear<10)
		{
		System.out.println("调整后工资为5065");
		}
		else if(workyear>=10&&workyear<12)
		{	
		System.out.println("调整后工资为5080");
		}
		else if(workyear>=12&&workyear<15)
		{
		System.out.println("调整后工资为5280");
		}
		else
		{
		System.out.println("调整后工资为5300");
		}

			}
				}