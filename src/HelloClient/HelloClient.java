package HelloClient;
/*this program write by Shiina at 2021/6/17/8:36*/

import java.net.Socket;
import java.net.ServerSocket;
import java.util.*;
import java.io.PrintStream;

public class HelloClient {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost",9999);//���ӷ�����
        Scanner scan = new Scanner(client.getInputStream());
        scan.useDelimiter("\n");
        if(scan.hasNext()){
            System.out.print("����˷�������"+scan.next());

        }
        scan.close();
        client.close();
    }
}