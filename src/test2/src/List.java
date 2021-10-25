import java.util.Scanner;
class Array {
    public void List1(char[] ss) {
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }
}
public class List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ÇëÊäÈëÒ»´®×Ö·û´®:");
        String str = input.next();
        char[] ss = str.toCharArray();
        Array a= new Array();
        a.List1(ss);
        }
    }

