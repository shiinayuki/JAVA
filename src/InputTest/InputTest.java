/*1��������import java.util.Scanner;
2������Scanner��Ķ���Scanner input = new Scanner(System.in);
3���������ַ�����String name = input.next();
���������Σ�int x = input.nextInt();
�����븡���ͣ� double x = input.nextDouble();
�������ַ��ͣ� char x = input.next().charAt(0);
*/

public class InputTest
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("�������������䣺");
		int age = s.nextInt();//ͣ�����ȴ��û������룬����֮���Զ����գ���ֵ��age������
		System.out.println("age = " + age);
	}
}