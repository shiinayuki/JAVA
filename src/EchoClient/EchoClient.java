package EchoClient;
/*this program write by Shiina at 2021/6/17/8:57*/

import java.io.PrintStream;
import java.util.*;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost",9999);
        Scanner enter = new Scanner(System.in);
        Scanner in = new Scanner(client.getInputStream());
        in.useDelimiter("\n");
        PrintStream out = new PrintStream(client.getOutputStream());
        boolean flag = true;
        while(flag){
            String data = enter.next().trim();
            out.println(data);
            if("exit".equalsIgnoreCase(data)){
                flag = false;
            }else{
                if(in.hasNext()){
                    String read = in.next().trim();
                    System.out.println(read);
                }
            }
        }
        client.close();
    }
}
