/*writed by Ouyangzirun 2021/3/17*/
import java.io.*;
import java.util.*;
public class TemperatureTranslator
{
	public static void main(String[] args)throws IOException{
		System.out.println("���Ǹ����϶�ת����");
		int i = 1;
		while(i<100)
		{
		System.out.println("����������¶ȵ����϶ȣ�");
		Scanner in = new Scanner(System.in);
        double celsius = in.nextDouble();
		double fahrenheit;
		fahrenheit = (9.0 / 5.0)*celsius+32.0 ;
		System.out.print("���϶�Ϊ:");
		System.out.println(fahrenheit);
		if(celsius <= 7)
		{ 
		System.out.println("�������µ���");
			}
		else if(celsius > 7&&celsius < 25)
		{	
		System.out.println("���������º�");
			}
		else
		{	
		System.out.println("�������¸���");
			}
		}
	}
}			