//有n个整数，使其前面各数顺序向后移m个位置，使最后m个数变成最前面的m个数
//函数输入示例:move(int[] arr, int m)
import java.util.Scanner;
class a {
    //方法一
    public String reverse(String str,int begIndex,int endIndex){

        if (str != null){
            char[] chars = str.toCharArray();//把字符串拆分成单个字符存进char型数组内
            for (int i = begIndex,j = endIndex;i < j;i++,j--){//指定字符的顺序颠倒
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            return new String(chars);
        }
        return null;
    }
    //方法二
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
        System.out.println("原始字符串为：abcdefg");
        String a = test.reverse(str1, 2, 5);
        System.out.println("使用第一种方法变换后字符串为：" +  a);
        String b = test.reverse1(str1, 2, 5);
        System.out.println("使用第二种方法后变换后字符串为：" +  b);
            System.out.println("请输入一串字符串:");
            String str = sc.next();
            System.out.println("请输入要顺序颠倒的起始字符与终止字符");
            System.out.println("起始字符");
            int s1 = sc.nextInt();
            System.out.println("终止字符");
            int s2 = sc.nextInt();
            String a1 = test.reverse(str, s1-1, s2-1);
            System.out.println("使用第一种方法变换后字符串为：" +  a1);
            String b1 = test.reverse1(str, s1-1, s2-1);
            System.out.println("使用第二种方法后变换后字符串为：" +  b1);

    }
}
