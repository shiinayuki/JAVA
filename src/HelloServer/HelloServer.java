package HelloServer;
/*this program write by Shiina at 2021/6/17/8:27*/

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(9999);
        System.out.println("·þÎñÆ÷Æô¶¯¡£¡£¡£");
        Socket client = server.accept();
        PrintStream out =new PrintStream(client.getOutputStream());
        out.println("Hello  World");
        out.close();
        client.close();
        server.close();

    }
}
