/*3ؼ����϶��ַ����ڽϳ��ַ����еĳ��ֵĴ���
        ���ӣ�
        ���ַ�����ac
        ���ַ�����ackjiojiojacjojoiackk
        ������3��
 */
import java.util.Scanner;
class Substring {
    public void Sub()
    {
        int times=0;
        System.out.println("������һ�����ַ�����");
        String zfc=new Scanner(System.in).next();
        System.out.println("��������Ҫ���ҳ��ִ����Ķ��ַ�����");
        String zf=new Scanner(System.in).next();
        for(int i=0;i<zfc.length()-1;i++)
        {
            String sub=zfc.substring(i, i+1);
            if(sub.equals(zf))
            {
                times++;
            }
        }
        System.out.println("���ֵĴ���Ϊ��"+times);
    }

    public static void main(String[] args) {
        new Substring().Sub();
    }
}