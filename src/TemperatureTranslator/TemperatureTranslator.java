/*writed by Ouyangzirun 2021/3/17*/
import java.io.*;
import java.util.*;
public class TemperatureTranslator
{
	public static void main(String[] args)throws IOException{
		System.out.println("这是个华氏度转换器");
		int i = 1;
		while(i<100)
		{
		System.out.println("请输入今日温度的摄氏度：");
		Scanner in = new Scanner(System.in);
        double celsius = in.nextDouble();
		double fahrenheit;
		fahrenheit = (9.0 / 5.0)*celsius+32.0 ;
		System.out.print("华氏度为:");
		System.out.println(fahrenheit);
		if(celsius <= 7)
		{ 
		System.out.println("今日气温低温");
			}
		else if(celsius > 7&&celsius < 25)
		{	
		System.out.println("今日气温温和");
			}
		else
		{	
		System.out.println("今日气温高温");
			}
		}
	}
}			