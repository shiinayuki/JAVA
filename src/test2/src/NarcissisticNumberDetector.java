/*2丶练习：随意给出一个三位数的整数，判断是否为水仙花数。（水仙花数）
 例子：
153=1*1*1+5*5*5+3*3*3；
* */
import java.util.Scanner;
public class NarcissisticNumberDetector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int x = sc.nextInt();
        int a = x / 100;
        int b = x % 100 / 10 ;
        int c = x % 10;
        if(Math.pow (a,3) + Math.pow (b,3) + Math.pow (c,3) == x ){
            System.out.println(x + "为水仙花数");
        }else{
            System.out.println(x + "不为水仙花数");
        }
    }
}
