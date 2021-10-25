/*1、导包：import java.util.Scanner;
2、创建Scanner类的对象：Scanner input = new Scanner(System.in);
3、①输入字符串：String name = input.next();
②输入整形：int x = input.nextInt();
③输入浮点型： double x = input.nextDouble();
④输入字符型： char x = input.next().charAt(0);
*/

public class InputTest
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入您的年龄：");
		int age = s.nextInt();//停下来等待用户的输入，输入之后自动接收，赋值给age变量。
		System.out.println("age = " + age);
	}
}