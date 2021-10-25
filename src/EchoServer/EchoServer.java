package EchoServer;
/*this program write by Shiina at 2021/6/17/8:48*/

import java.net.ServerSocket;
import java.util.*;
import java.io.PrintStream;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(9999);
        System.out.println("服务器启动...");
        Socket client = server.accept();
        Scanner in =  new Scanner(client.getInputStream());
        in.useDelimiter("\n");
        PrintStream out = new PrintStream(client.getOutputStream());
        boolean flag = true;
        while(flag){
            if(in.hasNext()){
                String data = in.next().trim();
                if("exit".equalsIgnoreCase(data)){
                    flag = false;//退出循环
                    out.println("程序结束，拜拜，下次再来！");
                }else{
                    out.println("ECHO:"+data);
                }
            }
        }
    }
}
