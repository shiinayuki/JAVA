import java.util.Scanner;
class calculate{
    int a;
    int b;
    int sum;
    public int plus(int a, int b){
        sum = a + b;
        System.out.println("相加得=" +sum);
        return sum;
    }
    public int minus(int a, int b){
        sum = a - b;
        System.out.println("相减得=" +sum);
        return sum;
    }
    public double multiply(int a, int b){
        sum = a * b;
        System.out.println("相乘得=" +sum);
        return sum;
    }
    public double divide(int a, int b){
        sum = a / b;
        System.out.println("相除得=" +sum);
        return sum;
    }

}
public class Calculation  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        calculate c= new calculate();
        c.plus(a,b);
        c.minus(a,b);
        c.multiply(a,b);
        c.divide(a,b);
    }

}
