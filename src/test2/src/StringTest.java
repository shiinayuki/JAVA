//��n��������ʹ��ǰ�����˳�������m��λ�ã�ʹ���m���������ǰ���m����
//��������ʾ��:move(int[] arr, int m)
import java.util.Scanner;
class a {
    //����һ
    public String reverse(String str,int begIndex,int endIndex){

        if (str != null){
            char[] chars = str.toCharArray();//���ַ�����ֳɵ����ַ����char��������
            for (int i = begIndex,j = endIndex;i < j;i++,j--){//ָ���ַ���˳��ߵ�
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            return new String(chars);
        }
        return null;
    }
    //������
    public String reverse1(String str,int begindex,int endIndex){

        if (str != null){
            StringBuilder str2 = new StringBuilder(str.length());
            str2.append(str.substring(0,begindex));
            for (int i = endIndex;i >= begindex;i--){
                str2.append(str.charAt(i));
            }
            str2.append(str.substring(endIndex + 1));
            return new String(str2);

        }

        return null;
    }
    }
    public class StringTest{
        public static void main(String[] args) {
        a test = new a();
            Scanner sc = new Scanner(System.in);
        String str1 = "abcdefg";
        System.out.println("ԭʼ�ַ���Ϊ��abcdefg");
        String a = test.reverse(str1, 2, 5);
        System.out.println("ʹ�õ�һ�ַ����任���ַ���Ϊ��" +  a);
        String b = test.reverse1(str1, 2, 5);
        System.out.println("ʹ�õڶ��ַ�����任���ַ���Ϊ��" +  b);
            System.out.println("������һ���ַ���:");
            String str = sc.next();
            System.out.println("������Ҫ˳��ߵ�����ʼ�ַ�����ֹ�ַ�");
            System.out.println("��ʼ�ַ�");
            int s1 = sc.nextInt();
            System.out.println("��ֹ�ַ�");
            int s2 = sc.nextInt();
            String a1 = test.reverse(str, s1-1, s2-1);
            System.out.println("ʹ�õ�һ�ַ����任���ַ���Ϊ��" +  a1);
            String b1 = test.reverse1(str, s1-1, s2-1);
            System.out.println("ʹ�õڶ��ַ�����任���ַ���Ϊ��" +  b1);

    }
}