import java.util.Scanner;
class calculate{
    int a;
    int b;
    int sum;
    public int plus(int a, int b){
        sum = a + b;
        System.out.println("��ӵ�=" +sum);
        return sum;
    }
    public int minus(int a, int b){
        sum = a - b;
        System.out.println("�����=" +sum);
        return sum;
    }
    public double multiply(int a, int b){
        sum = a * b;
        System.out.println("��˵�=" +sum);
        return sum;
    }
    public double divide(int a, int b){
        sum = a / b;
        System.out.println("�����=" +sum);
        return sum;
    }

}
public class Calculation  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ����");
        int a = sc.nextInt();
        System.out.println("������ڶ�����");
        int b = sc.nextInt();
        calculate c= new calculate();
        c.plus(a,b);
        c.minus(a,b);
        c.multiply(a,b);
        c.divide(a,b);
    }

}