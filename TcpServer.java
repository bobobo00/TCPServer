package TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 流程：
 * 创建服务器
 * 1.指定端口：使用ServerSocket创建服务器
 * 2，阻塞式等待连接accept
 * 3，操作：输入输出流操作
 * 4，释放资源。
 * @author dell
 *
 */

public class TcpServer {
	public static void main(String[] args) throws IOException {
		System.out.println("--------Server-----------");
		ServerSocket server=new ServerSocket(8888);
		Socket client=server.accept();
		System.out.println("一个客户建立了连接！");
	    DataInputStream dis=new DataInputStream(client.getInputStream());
	    String data=dis.readUTF();
	    System.out.println(data);
	    //服务器不用关闭。
	    dis.close();
	    client.close();
	    
		
	}

}
