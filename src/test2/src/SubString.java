/*3丶计算较短字符串在较长字符串中的出现的次数
        例子：
        短字符串：ac
        长字符串：ackjiojiojacjojoiackk
        出现了3次
 */
import java.util.Scanner;
class Substring {
    public void Sub()
    {
        int times=0;
        System.out.println("请输入一个长字符串：");
        String zfc=new Scanner(System.in).next();
        System.out.println("请输入需要查找出现次数的短字符串：");
        String zf=new Scanner(System.in).next();
        for(int i=0;i<zfc.length()-1;i++)
        {
            String sub=zfc.substring(i, i+1);
            if(sub.equals(zf))
            {
                times++;
            }
        }
        System.out.println("出现的次数为："+times);
    }

    public static void main(String[] args) {
        new Substring().Sub();
    }
}