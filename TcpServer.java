package TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ���̣�
 * ����������
 * 1.ָ���˿ڣ�ʹ��ServerSocket����������
 * 2������ʽ�ȴ�����accept
 * 3���������������������
 * 4���ͷ���Դ��
 * @author dell
 *
 */

public class TcpServer {
	public static void main(String[] args) throws IOException {
		System.out.println("--------Server-----------");
		ServerSocket server=new ServerSocket(8888);
		Socket client=server.accept();
		System.out.println("һ���ͻ����������ӣ�");
	    DataInputStream dis=new DataInputStream(client.getInputStream());
	    String data=dis.readUTF();
	    System.out.println(data);
	    //���������ùرա�
	    dis.close();
	    client.close();
	    
		
	}

}
